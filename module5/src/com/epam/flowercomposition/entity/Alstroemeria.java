package com.epam.flowercomposition.entity;


public class Alstroemeria extends Flower {
    private final String name;

    public Alstroemeria(String color, double price) {
        super(color, price);
        this.name = "Alstroemeria";
    }

    @Override
    public String toString() {
        return  name +
                ": color = " + getColor() +
                ", price = " + getPrice();
    }
}
