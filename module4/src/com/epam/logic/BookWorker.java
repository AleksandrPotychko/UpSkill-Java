package com.epam.logic;

import com.epam.entity.Book;

import java.util.Arrays;

public class BookWorker {
    public static Book findAuthorsBooks (Book books, String[] author) {
       Book book = null;
        if (Arrays.equals(author, books.getAuthors())) {
            book = books;
        }
        return book;
    }

    public static Book findPublisherBooks (Book books, String publisher) {
        Book book = null;
        if (publisher.equals(books.getPublisher())) {
            book = books;
        }
        return book;
    }

    public static Book findBooksPublishedAfter (Book books, int lowerLimitPublicationYear) {
        Book book = null;
        if (lowerLimitPublicationYear < books.getPublicationYear()) {
            book = books;
        }
        return book;
    }
}
