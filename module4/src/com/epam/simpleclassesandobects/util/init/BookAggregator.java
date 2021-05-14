package com.epam.simpleclassesandobects.util.init;

import com.epam.simpleclassesandobects.entity.Book;

public class BookAggregator {
    public static Book[] createBook(int capacity) {
        Book[] books = new Book[capacity];
        books[0] = new Book(1, "Alice’s Adventures in Wonderland", new String[]{"Lewis Carroll"},
                "Macmillan and Co", 1865, 61, 10, "paperback");
        books[1] = new Book(2, "The Adventures of Tom Sawyer", new String[]{"Mark Twain"},
                "Macmillan and Co", 1876, 77, 30, "paperback");
        books[2] = new Book(3, "Dune", new String[]{"Frank Herbert"},
                "Chilton Books", 1965, 704, 50, "hardcover");
        books[3] = new Book(4, "Children of Dune", new String[]{"Frank Herbert"},
                "G. P. Putnam's Sons", 1976, 61, 640, "hardcover");
        books[4] = new Book(5, "Atlas Shrugged", new String[]{"Ayn Rand"},
                "Random House", 1957, 1136, 33, "hardcover");
        return books;
    }
}
