package com.epam.aggregationandcomposition.entity;

import java.util.Objects;

public class Trip {
    private String country;
    private int days;
    private TypeOfTrip typeOfTrip;
    private Transport transport;
    private Feeding feeding;

    public Trip(String country, int days, TypeOfTrip typeOfTrip, Transport transport, Feeding feeding) {
        this.country = country;
        this.days = days;
        this.typeOfTrip = typeOfTrip;
        this.transport = transport;
        this.feeding = feeding;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public TypeOfTrip getTypeOfTrip() {
        return typeOfTrip;
    }

    public void setTypeOfTrip(TypeOfTrip typeOfTrip) {
        this.typeOfTrip = typeOfTrip;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return days == trip.days && Objects.equals(country, trip.country) && Objects.equals(typeOfTrip, trip.typeOfTrip) && Objects.equals(transport, trip.transport) && Objects.equals(feeding, trip.feeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, days, typeOfTrip, transport, feeding);
    }

    @Override
    public String toString() {
        return "Trip: " +
                "country = " + country +
                ", days = " + days + ", " +
                typeOfTrip + ", " +
                transport + ", " +
                feeding +
                '.';
    }
}
