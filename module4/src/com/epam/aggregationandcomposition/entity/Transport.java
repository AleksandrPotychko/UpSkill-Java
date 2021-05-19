package com.epam.aggregationandcomposition.entity;

import java.util.Objects;

public class Transport implements Comparable<Transport> {
    private String typeTransport;

    private Transport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public static Transport CAR = new Transport("Car");
    public static Transport BUS = new Transport("Bus");
    public static Transport Plane = new Transport("Plane");
    public static Transport Train = new Transport("Train");
    public static Transport SHIP = new Transport("Chip");
    public static Transport BICYCLE = new Transport("Bicycle");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(typeTransport, transport.typeTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeTransport);
    }

    @Override
    public String toString() {
        return "Transport: " + typeTransport;
    }

    @Override
    public int compareTo(Transport o) {
        return typeTransport.compareTo(o.typeTransport);
    }
}
