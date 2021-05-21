package com.epam.aggregationandcomposition.entity;

import java.util.List;
import java.util.Objects;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;
    private String brand;
    private int gasTank;

    public Car(Engine engine, String brand, int gasTank, List<Wheel> wheels) {
        this.engine = engine;
        this.brand = brand;
        this.gasTank = gasTank;
        this.wheels = wheels;
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

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void printCarBrand() {
        System.out.println("Car brand: " + brand);
    }

    public void drive(int count) {
        for (int i = 0; i < count; i++) {
            if (getGasTank() > 0) {
                setGasTank(getGasTank() - 1);
                System.out.println("Car " + getBrand() + " drives, fuel in the tank = " + gasTank);
            } else if (getGasTank() == 0) {
                System.out.println("Car " + getBrand() + " stopped, fuel in the tank = " + gasTank + " need refuel.");
                break;
            }
        }
    }

    public void refuel(int count) {
        for (int i = 0; i < count; i++) {
            if (getGasTank() < 100) {
                setGasTank(getGasTank() + 1);
                System.out.println("Car " + getBrand() + " is filled with 1 percent, fuel in the tank = " + gasTank);
            } else if (getGasTank() == 100) {
                System.out.println("Car " + getBrand() + " is fully fueled, fuel in the tank = " + gasTank);
                break;
            }
        }
    }

    public void changeWheel(int replacementWheelNumber, Wheel newWheel) {
        switch (replacementWheelNumber) {
            case (1):
                wheels.set(0, newWheel);
                break;
            case (2):
                wheels.set(1, newWheel);
                break;
            case (3):
                wheels.set(2, newWheel);
                break;
            case (4):
                wheels.set(3, newWheel);
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gasTank == car.gasTank && Objects.equals(engine, car.engine) && Objects.equals(wheels, car.wheels) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, wheels, brand, gasTank);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine " + engine +
                ", wheels:" + wheels +
                ", brand = '" + brand + '\'' +
                ", gasTank = " + gasTank +
                '}';
    }
}
