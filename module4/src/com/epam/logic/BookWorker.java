package com.epam.logic;

import com.epam.entity.Book;
import java.util.ArrayList;
import java.util.Arrays;


public class BookWorker {
    public static ArrayList<Book> findAuthorsBooks (Book[] books, String[] author) {
        ArrayList<Book> authorBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (Arrays.equals(author, books[i].getAuthors())) {
                authorBooks.add(books[i]);
            }
        }
        return authorBooks;
    }

    public static ArrayList<Book> findPublisherBooks (Book[] books, String publisher) {
        ArrayList<Book> publisherBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (publisher.equals(books[i].getPublisher())) {
                publisherBooks.add(books[i]);
            }
        }
        return publisherBooks;
    }

    public static ArrayList<Book> findBooksPublishedAfterYear (Book[] books, int lowerLimitPublicationYear) {
        ArrayList<Book> publishedBooks = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (lowerLimitPublicationYear < books[i].getPublicationYear()) {
                publishedBooks.add(books[i]);
            }
        }
        return publishedBooks;
    }
}
