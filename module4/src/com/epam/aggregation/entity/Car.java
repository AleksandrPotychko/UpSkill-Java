package com.epam.aggregation.entity;


import java.util.Objects;

public class Car {
    private Engine engine;
    private Wheel firstWheel;
    private Wheel secondWheel;
    private Wheel thirdWheel;;
    private Wheel fourthWheel;
    private String brand;
    private int gasTank;

    public Car(Engine engine, String brand, int gasTank, Wheel firstWheel, Wheel secondWheel, Wheel thirdWheel,
               Wheel fourthWheel) {
        this.engine = engine;
        this.brand = brand;
        this.gasTank = gasTank;
        this.firstWheel = firstWheel;
        this.secondWheel = secondWheel;
        this.thirdWheel = thirdWheel;
        this.fourthWheel = fourthWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGasTank() {
        return gasTank;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }

    public Wheel getFirstWheel() {
        return firstWheel;
    }

    public void setFirstWheel(Wheel firstWheel) {
        this.firstWheel = firstWheel;
    }

    public Wheel getSecondWheel() {
        return secondWheel;
    }

    public void setSecondWheel(Wheel secondWheel) {
        this.secondWheel = secondWheel;
    }

    public Wheel getThirdWheel() {
        return thirdWheel;
    }

    public void setThirdWheel(Wheel thirdWheel) {
        this.thirdWheel = thirdWheel;
    }

    public Wheel getFourthWheel() {
        return fourthWheel;
    }

    public void setFourthWheel(Wheel fourthWheel) {
        this.fourthWheel = fourthWheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) && Objects.equals(firstWheel, car.firstWheel) && Objects.equals(secondWheel, car.secondWheel) && Objects.equals(thirdWheel, car.thirdWheel) && Objects.equals(fourthWheel, car.fourthWheel) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, firstWheel, secondWheel, thirdWheel, fourthWheel, brand);
    }

    @Override
    public String toString() {
        return "Car{ " +
                "engine " + engine +
                ", first wheel " + firstWheel +
                ", second wheel " + secondWheel +
                ", third wheel " + thirdWheel +
                ", fourth wheel " + fourthWheel +
                ", brand = '" + brand + '\'' +
                ", Fuel in the gas tank = " + gasTank +
                '}';
    }
}
