package com.epam.flowercomposition.entity;

public class Pion extends Flower {
    private final String name;

    public Pion(String color, double price) {
        super(color, price);
        this.name = "Pion";
    }

    @Override
    public String toString() {
        return  name +
                ": color = " + getColor() +
                ", price = " + getPrice();
    }
}
