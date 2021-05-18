package com.epam.entity;

import java.util.Arrays;

public class Airline {
    private String destinationPoint;
    private int flightNumber;
    private String aircraftType;
    private double departureTime;
    private String[] weekDays;

    public Airline(String destinationPoint, int flightNumber, String aircraftType, double departureTime,
                   String[] weekDays) {
        this.destinationPoint = destinationPoint;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String[] weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "Destination point = '" + destinationPoint + '\'' +
                ", Flight number = " + flightNumber +
                ", Aircraft type = '" + aircraftType + '\'' +
                ", Departure time = " + departureTime +
                ", Week days = " + Arrays.toString(weekDays) +
                '}';
    }
}
