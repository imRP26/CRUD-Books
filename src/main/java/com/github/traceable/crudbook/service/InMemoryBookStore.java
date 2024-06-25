package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.Filter;
import com.github.traceable.crudbook.pb.Book;
import io.grpc.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;


public class InMemoryBookStore implements BookStore {
    private ConcurrentMap<String, Book> data;
    private static final Logger logger = Logger.getLogger(BookClient.class.getName());

    public InMemoryBookStore() {
        data = new ConcurrentHashMap<>();
    }

    @Override
    public void Save(Book book) throws Exception {
        if (data.containsKey(book.getIsbn()))
            throw new AlreadyExistsException("Book ISBN already exists!");
        Book other = book.toBuilder().build(); // deep copy
        data.put(other.getIsbn(), other);
    }

    @Override
    public Book Find(String isbn) {
        if (!data.containsKey(isbn))
            return null;
        Book other = data.get(isbn).toBuilder().build(); // deep copy
        return other;
    }

    private boolean isValid(Filter filter, Book book) {
        return book.getPageCount() >= filter.getMinPageCount();
    }

    @Override
    public void Search(Context ctx, Filter filter, BookStream stream) {
        for (Map.Entry<String, Book> entry: data.entrySet()) {
            if (ctx.isCancelled()) {
                logger.info("Context is cancelled!");
                return;
            }
            Book book = entry.getValue();
            if (isValid(filter, book))
                stream.Send(book.toBuilder().build());
        }
    }
}
