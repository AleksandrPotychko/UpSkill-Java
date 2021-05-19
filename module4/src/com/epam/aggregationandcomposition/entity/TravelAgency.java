package com.epam.aggregationandcomposition.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TravelAgency {
    private String name;
    private List<Trip> trips;

    public TravelAgency(String name, List<Trip> trips) {
        this.name = name;
        this.trips = trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Trip> findTripsByTransport(Transport transport) {
        List<Trip> foundTrips = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getTransport().equals(transport)) {
                foundTrips.add(trip);
            }
        }
        return foundTrips;
    }

    public List<Trip> findTripsByFeeding(Feeding feeding) {
        List<Trip> foundTrips = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getFeeding().equals(feeding)) {
                foundTrips.add(trip);
            }
        }
        return foundTrips;
    }

    public List<Trip> findTripsByType(TypeOfTrip typeOfTrip) {
        List<Trip> foundTrips = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getTypeOfTrip().equals(typeOfTrip)) {
                foundTrips.add(trip);
            }
        }
        return foundTrips;
    }

    public List<Trip> findTripsByTypeAndDays(TypeOfTrip typeOfTrip, int days) {
        List<Trip> foundTrips = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getTypeOfTrip().equals(typeOfTrip) && trip.getDays() == days) {
                foundTrips.add(trip);
            }
        }
        return foundTrips;
    }

    public void sortByDays() {
        getTrips().sort(Comparator.comparing(Trip::getDays));
    }

    public void sortByTransport() {
        getTrips().sort(Comparator.comparing(Trip::getTransport));
    }

    public void sortByFeeding() {
        getTrips().sort(Comparator.comparing(Trip::getFeeding));
    }

    public void sortByTypeOfTrip() {
        getTrips().sort(Comparator.comparing(Trip::getTypeOfTrip));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelAgency that = (TravelAgency) o;
        return Objects.equals(name, that.name) && Objects.equals(trips, that.trips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, trips);
    }

    @Override
    public String toString() {
        return "Travel agency: " + name  +
                ", trips: " + trips +
                '.';
    }
}