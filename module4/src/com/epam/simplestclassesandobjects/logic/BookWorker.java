package com.epam.simplestclassesandobjects.logic;

import com.epam.simplestclassesandobjects.entity.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookWorker {
    public static List<Book> findAuthorsBooks (Book[] books, String[] author) {
        List<Book> authorBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (Arrays.equals(author, books[i].getAuthors())) {
                authorBooks.add(books[i]);
            }
        }
        return authorBooks;
    }

    public static List<Book> findPublisherBooks (Book[] books, String publisher) {
        List<Book> publisherBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (publisher.equals(books[i].getPublisher())) {
                publisherBooks.add(books[i]);
            }
        }
        return publisherBooks;
    }

    public static List<Book> findBooksPublishedAfterYear (Book[] books, int lowerLimitPublicationYear) {
        List<Book> publishedBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (lowerLimitPublicationYear < books[i].getPublicationYear()) {
                publishedBooks.add(books[i]);
            }
        }
        return publishedBooks;
    }
}
