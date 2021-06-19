package com.epam.flowercomposition.entity;

import java.util.Arrays;
import java.util.Objects;

public class FlowerPackage {
    private String color;
    private Flower[] flower;

    public FlowerPackage(String color, Flower...flowers) {
        this.color = color;
        this.flower = flowers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Flower[] getFlower() {
        return flower;
    }

    public void setFlower(Flower[] flower) {
        this.flower = flower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerPackage that = (FlowerPackage) o;
        return Objects.equals(color, that.color) && Arrays.equals(flower, that.flower);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color);
        result = 31 * result + Arrays.hashCode(flower);
        return result;
    }

    @Override
    public String toString() {
        return  color + " package: " +
                Arrays.toString(flower) +
                '.';
    }
}
