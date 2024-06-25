package com.github.traceable.crudbook.serializer;

import com.github.traceable.crudbook.pb.Book;
import com.github.traceable.crudbook.sample.Generator;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;


public class SerializerTest {

    @Test
    public void writeAndReadBinaryFile() throws IOException {
        String binaryFile = "book.bin";
        Book book1 = new Generator().NewBook();
        Serializer serializer = new Serializer();
        serializer.WriteBinaryFile(book1, binaryFile);
        Book book2 = serializer.ReadBinaryFile(binaryFile);
        Assert.assertEquals(book1, book2);
    }
}
