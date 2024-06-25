package com.github.traceable.crudbook.sample;

import com.github.traceable.crudbook.pb.*;
import java.util.Random;
import java.util.UUID;


public class Generator {
    private final Random rand;

    public Generator() {
        rand = new Random();
    }

    private int randomInt(int min, int max) {
        return min + rand.nextInt(max - min + 1);
    }

    private String randomStringFromSet(String ... a) {
        int n = a.length;
        if (n == 0)
            return "";
        return a[rand.nextInt(n)];
    }

    private String randomBookName() {
        return randomStringFromSet("Operating Systems", "Distributed Systems", "Machine Learning");
    }

    private String randomAuthorName(String bookName) {
        switch (bookName) {
            case "Operating Systems":
                return randomStringFromSet("Rezmi", "Tanenbaum", "Silberschatz");
            case "Machine Learning":
                return randomStringFromSet("Chris Bishop", "Tom Mitchell", "Josh Starmer");
            default:
                return randomStringFromSet("Nancy Lynch", "Martin Kleppmann", "Alex Petrov");
        }
    }

    public Book NewBook() {
        String title = randomBookName();
        String author = randomAuthorName(title);
        int numPages = randomInt(400, 1200);
        return Book.newBuilder()
                .setIsbn(UUID.randomUUID().toString())
                .setTitle(title)
                .addAuthors(author)
                .setPageCount(numPages)
                .build();
    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        Book book = generator.NewBook();
        System.out.println(book);
    }
}
