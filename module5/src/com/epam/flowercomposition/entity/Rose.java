package com.epam.flowercomposition.entity;


public class Rose extends Flower {
    private final String name;

    public Rose(String color, double price) {
        super(color, price);
        this.name = "Rose";
    }

    @Override
    public String toString() {
        return  name +
                ": color = " + getColor() +
                ", price = " + getPrice();
    }
}
