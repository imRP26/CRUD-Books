package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.Filter;
import com.github.traceable.crudbook.pb.Book;
import io.grpc.Context;


public interface BookStore {
    void Save(Book book) throws Exception;
    Book Find(String isbn);
    void Search(Context ctx, Filter filter, BookStream stream);
    void Delete(String isbn);
    void Update(Book book);
}
