package com.epam.simplestclassesandobjects.entity;

import java.util.Objects;

public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, trainNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationName = '" + destinationName + '\'' +
                ", trainNumber = " + trainNumber +
                ", departureTime= '" + departureTime + '\'' +
                "}\n";
    }
}
