package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.*;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class BookService extends BookServiceGrpc.BookServiceImplBase {
    private static final Logger logger = Logger.getLogger(BookService.class.getName());
    private BookStore store;

    public BookService(BookStore store) {
        this.store = store;
    }

    @Override
    public void createBook(CreateBookRequest request, StreamObserver<CreateBookResponse> responseObserver) {
        Book book = request.getBook();
        String isbn = book.getIsbn();
        logger.info("Got a create-book request with ISBN: " + isbn);
        UUID uuid;
        if (isbn.isEmpty())
            uuid = UUID.randomUUID();
        else {
            try {
                uuid = UUID.fromString(isbn);
            }
            catch (IllegalArgumentException e) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription(e.getMessage())
                        .asRuntimeException());
                return;
            }
        }
        if (Context.current().isCancelled()) {
            logger.info("Request is cancelled!");
            responseObserver.onError(Status.CANCELLED
                    .withDescription("Request is cancelled")
                    .asRuntimeException());
            return;
        }
        Book other = book.toBuilder().setIsbn(uuid.toString()).build();
        try {
            store.Save(other);
        }
        catch (AlreadyExistsException e) {
            responseObserver.onError(Status.ALREADY_EXISTS
                    .withDescription(e.getMessage())
                    .asRuntimeException());
            return;
        }
        catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription(e.getMessage())
                    .asRuntimeException());
            return;
        }
        CreateBookResponse response = CreateBookResponse.newBuilder().setIsbn(other.getIsbn()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        logger.info("Saved book with ISBN: " + other.getIsbn());
    }

    @Override
    public void searchBook(SearchBookRequest request, StreamObserver<SearchBookResponse> responseObserver) {
        Filter filter = request.getFilter();
        logger.info("Got a filter request with filter:\n" + filter);
        store.Search(Context.current(), filter, new BookStream() {
            @Override
            public void Send(Book book) {
                logger.info("Found book with ISBN: " + book.getIsbn());
                SearchBookResponse response = SearchBookResponse.newBuilder().setBook(book).build();
                responseObserver.onNext(response);
            }
        });
        responseObserver.onCompleted();
        logger.info("Book search completed!");
    }
}
