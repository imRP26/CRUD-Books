package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.*;
import com.github.traceable.crudbook.sample.Generator;
import io.grpc.*;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;


public class BookServerTest {
    @Rule
    // automatic graceful channel shutdown at the end of test
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    private BookStore store;
    private BookServer server;
    private ManagedChannel channel;

    @Before
    public void setUp() throws Exception {
        String serverName = InProcessServerBuilder.generateName();
        InProcessServerBuilder serverBuilder = InProcessServerBuilder.forName(serverName).directExecutor();
        store = new InMemoryBookStore();
        server = new BookServer(serverBuilder, 0, store);
        server.start();
        channel = grpcCleanup.register(
                InProcessChannelBuilder.forName(serverName).directExecutor().build()
        );
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void createBookWithAValidISBN() {
        Generator generator = new Generator();
        Book book = generator.NewBook();
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response = stub.createBook(request);
        assertNotNull(response);
        assertEquals(book.getIsbn(), response.getIsbn());
        Book found = store.Find(response.getIsbn());
        assertNotNull(found);
    }

    @Test
    public void createBookWithAnEmptyISBN() {
        Generator generator = new Generator();
        Book book = generator.NewBook().toBuilder().setIsbn("").build();
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response = stub.createBook(request);
        assertNotNull(response);
        assertFalse(response.getIsbn().isEmpty());
        Book found = store.Find(response.getIsbn());
        assertNotNull(found);
    }

    @Test(expected = StatusRuntimeException.class)
    public void createBookWithAnInvalidISBN() {
        Generator generator = new Generator();
        Book book = generator.NewBook().toBuilder().setIsbn("RP").build();
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response = stub.createBook(request);
        /*
         * No point in checking the below 2 exceptions, since it anyways
         * exits out before, as soon as an exception is received in response!
         *
         * assertNotNull(response);
         * assertNull(response.getIsbn());
         */
    }

    @Test(expected = StatusRuntimeException.class)
    public void createBookWithAnAlreadyExistsISBN() throws Exception {
        Generator generator = new Generator();
        Book book = generator.NewBook();
        store.Save(book);
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response = stub.createBook(request);
    }

    @Test
    public void deleteBookWithAValidISBN() throws Exception {
        Generator generator = new Generator();
        Book book = generator.NewBook();
        CreateBookRequest request1 = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub1 = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response1 = stub1.createBook(request1);
        DeleteBookRequest request2 = DeleteBookRequest.newBuilder().setIsbn(book.getIsbn()).build();
        BookServiceGrpc.BookServiceBlockingStub stub2 = BookServiceGrpc.newBlockingStub(channel);
        DeleteBookResponse response2 = stub2.deleteBook(request2);
        assertNotNull(response2);
        Book wasFound = store.Find(book.getIsbn());
        assertNull(wasFound);
    }

    @Test(expected = StatusRuntimeException.class)
    public void deleteBookWithAnInValidISBN() {
        Generator generator = new Generator();
        Book book = generator.NewBook();
        CreateBookRequest request1 = CreateBookRequest.newBuilder().setBook(book).build();
        BookServiceGrpc.BookServiceBlockingStub stub1 = BookServiceGrpc.newBlockingStub(channel);
        CreateBookResponse response1 = stub1.createBook(request1);
        DeleteBookRequest request2 = DeleteBookRequest.newBuilder().setIsbn(book.getIsbn() + '#').build();
        BookServiceGrpc.BookServiceBlockingStub stub2 = BookServiceGrpc.newBlockingStub(channel);
        DeleteBookResponse response2 = stub2.deleteBook(request2);
    }
}
