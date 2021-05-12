package com.epam.aggregation.logic;

import com.epam.aggregation.entity.Car;
import com.epam.aggregation.entity.Wheel;

public class CarWorker {

    public static void printBrand(Car car) {
        System.out.println(car.getBrand());
    }

    public static Car changeWheel(Car car, int numberOfBrokenWheel, Wheel spareWheel) {
        switch (numberOfBrokenWheel) {
            case (1):
                car.setFirstWheel(spareWheel);
                break;
            case (2):
                car.setSecondWheel(spareWheel);
                break;
            case (3):
                car.setThirdWheel(spareWheel);
                break;
            case (4):
                car.setFourthWheel(spareWheel);
                break;
        }
        return car;
    }

    public static Car refuelTheCar(Car car) {
        int fuel = car.getGasTank();
        if (fuel < 100) {
            fuel++;
            car.setGasTank(fuel);
        } else {
            return null;
        }
        return car;
    }

    public static Car rideByCar(Car car) {
        int fuel = car.getGasTank();
        if (fuel >= 0) {
            fuel--;
            car.setGasTank(fuel);
        } else {
            return null;
        }
        return car;
    }
}
