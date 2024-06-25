package com.github.traceable.crudbook.serializer;

import com.github.traceable.crudbook.pb.Book;
import com.github.traceable.crudbook.sample.Generator;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.util.JsonFormat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;


public class Serializer {

    public void WriteBinaryFile(Book book, String filename) throws IOException {
        FileOutputStream outStream = new FileOutputStream(filename);
        book.writeTo(outStream);
        outStream.close();
    }

    public Book ReadBinaryFile(String filename) throws IOException {
        FileInputStream inStream = new FileInputStream(filename);
        Book book = Book.parseFrom(inStream);
        inStream.close();
        return book;
    }

    public void WriteToJsonFile(Book book, String filename) throws IOException {
        JsonFormat.Printer printer = JsonFormat.printer()
                .includingDefaultValueFields(Collections.<FieldDescriptor>emptySet())
                .preservingProtoFieldNames();
        String jsonString = printer.print(book);
        FileOutputStream outStream = new FileOutputStream(filename);
        outStream.write(jsonString.getBytes());
        outStream.close();
    }

    public static void main(String[] args) throws IOException {
        Serializer serializer = new Serializer();
        Generator generator = new Generator();
        Book book1 = generator.NewBook();
        serializer.WriteBinaryFile(book1, "book.bin");
        Book book2 = serializer.ReadBinaryFile("book.bin");
        //serializer.WriteToJsonFile(book2, "book.json");
    }
}
