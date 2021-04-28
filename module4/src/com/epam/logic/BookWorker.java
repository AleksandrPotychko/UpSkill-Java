package com.epam.logic;

import com.epam.entity.Book;

import java.util.Arrays;

public class BookWorker {
    public static Book findAuthorsBook (Book book, String[] author) {
       Book authorBook = null;
        if (Arrays.equals(author, book.getAuthors())) {
            authorBook = book;
        }
        return authorBook;
    }

    public static Book findPublisherBook (Book book, String publisher) {
        Book publisherBook = null;
        if (publisher.equals(book.getPublisher())) {
            publisherBook = book;
        }
        return publisherBook;
    }

    public static Book findBookPublishedAfterYear (Book book, int lowerLimitPublicationYear) {
        Book publishedAfterYearBook = null;
        if (lowerLimitPublicationYear < book.getPublicationYear()) {
            publishedAfterYearBook = book;
        }
        return book;
    }
}
