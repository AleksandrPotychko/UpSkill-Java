package com.epam.entity;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String[] authors;
    private String publisher;
    private int publicationYear;
    private int numberOfPages;
    private float price;
    private String bindingType;

    public Book(int id, String name, String[] authors, String publisher, int publicationYear, int numberOfPages,
                float price, String bindingType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", Name = '" + name + '\'' +
                ", Authors = " + Arrays.toString(authors) +
                ", Publisher = '" + publisher + '\'' +
                ", Publication year = " + publicationYear +
                ", Number of pages = " + numberOfPages +
                ", Price = " + price +
                ", Binding type = '" + bindingType + '\'' +
                '}';
    }
}
