package com.github.traceable.crudbook.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class BookServer {
    private static final Logger logger = Logger.getLogger(BookServer.class.getName());
    private final int port;
    private final Server server;

    public BookServer(int port, BookStore store) {
        this(ServerBuilder.forPort(port), port, store);
    }

    public BookServer(ServerBuilder serverBuilder, int port, BookStore store) {
        this.port = port;
        BookService bookService = new BookService(store);
        server = serverBuilder.addService(bookService).build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started on Port " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("Shutting down gRPC server as the JVM has shut down!");
                try {
                    BookServer.this.stop();
                }
                catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("Server shut down.");
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null)
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null)
            server.awaitTermination();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        InMemoryBookStore store = new InMemoryBookStore();
        BookServer server = new BookServer(8080, store);
        server.start();
        server.blockUntilShutdown();
    }
}
