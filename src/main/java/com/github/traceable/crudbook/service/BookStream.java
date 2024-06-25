package com.github.traceable.crudbook.service;

import com.github.traceable.crudbook.pb.Book;


public interface BookStream {
    void Send(Book book);
}
