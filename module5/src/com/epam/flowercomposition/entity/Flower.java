package com.epam.flowercomposition.entity;

import java.util.Objects;

public abstract class Flower {
    private String color;
    private double price;

    public Flower(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0  && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }
}
