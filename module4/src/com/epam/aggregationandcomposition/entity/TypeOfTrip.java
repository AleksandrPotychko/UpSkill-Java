package com.epam.aggregationandcomposition.entity;

import java.util.Objects;

public class TypeOfTrip implements Comparable<TypeOfTrip> {
    private String typeOfTrip;

    private TypeOfTrip(String typeOfTrip) {
        this.typeOfTrip = typeOfTrip;
    }

    public static TypeOfTrip RECREATION = new TypeOfTrip("Recreation");
    public static TypeOfTrip TOUR = new TypeOfTrip("TOUR");
    public static TypeOfTrip SANATORIUM = new TypeOfTrip("Sanatorium");
    public static TypeOfTrip SHOPPING = new TypeOfTrip("Shopping");
    public static TypeOfTrip CRUISE = new TypeOfTrip("Cruise");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfTrip that = (TypeOfTrip) o;
        return Objects.equals(typeOfTrip, that.typeOfTrip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfTrip);
    }

    @Override
    public String toString() {
        return "Type of trip: " + typeOfTrip;
    }

    @Override
    public int compareTo(TypeOfTrip o) {
        return typeOfTrip.compareTo(o.typeOfTrip);
    }
}
