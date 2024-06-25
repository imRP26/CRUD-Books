package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.*;
import com.github.traceable.crudbook.pb.BookServiceGrpc.BookServiceBlockingStub;
import com.github.traceable.crudbook.sample.Generator;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BookClient {
    private static final Logger logger = Logger.getLogger(BookClient.class.getName());
    private final ManagedChannel channel;
    private final BookServiceBlockingStub blockingStub; // unary RPC

    public BookClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = BookServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void createBook(Book book) {
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        CreateBookResponse response = CreateBookResponse.getDefaultInstance();
        try {
            response = blockingStub.withDeadlineAfter(5, TimeUnit.SECONDS).createBook(request);
        }
        catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.ALREADY_EXISTS) {
                logger.info("Book already exists");
                return;
            }
            logger.log(Level.SEVERE, "Request failed: " + e.getMessage());
            return;
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "Request failed: " + e.getMessage());
            return;
        }
        logger.info("Book created with ISBN: " + response.getIsbn());
    }

    private void searchBook(Filter filter) {
        logger.info("Search started...");
        SearchBookRequest request = SearchBookRequest.newBuilder().setFilter(filter).build();
        Iterator<SearchBookResponse> responseIterator = blockingStub.searchBook(request);
        while (responseIterator.hasNext()) {
            SearchBookResponse response = responseIterator.next();
            Book book = response.getBook();
            logger.info("Book found: " + book.getIsbn());
        }
        logger.info("Search finished.");
    }

    public static void main(String[] args) throws InterruptedException {
        BookClient client = new BookClient("0.0.0.0", 8080);
        Generator generator = new Generator();
        /*
        Book book = generator.NewBook();
        try {
            client.createBook(book);
        }
        */
        try {
            for (int i = 0; i < 10; i++) {
                Book book = generator.NewBook();
                client.createBook(book);
            }
            Filter filter = Filter.newBuilder()
                    .setMinPageCount(700)
                    .build();
            client.searchBook(filter);
        }
        finally {
            client.shutdown();
        }
    }
}
