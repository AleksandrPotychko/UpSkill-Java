package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.Feeding;
import com.epam.aggregationandcomposition.entity.Transport;
import com.epam.aggregationandcomposition.entity.Trip;
import com.epam.aggregationandcomposition.entity.TypeOfTrip;

import java.util.ArrayList;
import java.util.List;

public class TripInitializer {
    public static List<Trip> createTrips() {
        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip("Belarus",14, TypeOfTrip.TOUR, Transport.BICYCLE, Feeding.WITHOUT_FOOD));
        trips.add(new Trip("Belarus",7, TypeOfTrip.RECREATION, Transport.BUS, Feeding.ALL_INCLUSIVE));
        trips.add(new Trip("Belarus",14, TypeOfTrip.SHOPPING, Transport.CAR, Feeding.BREAKFAST));
        trips.add(new Trip("Bahamas",7, TypeOfTrip.RECREATION, Transport.Plane, Feeding.ALL_INCLUSIVE));
        trips.add(new Trip("Bahamas",14, TypeOfTrip.RECREATION, Transport.SHIP, Feeding.BREAKFAST));
        trips.add(new Trip("Bahamas",21, TypeOfTrip.CRUISE, Transport.SHIP, Feeding.ALL_INCLUSIVE));
        trips.add(new Trip("Poland",7, TypeOfTrip.SHOPPING, Transport.Train, Feeding.WITHOUT_FOOD));
        trips.add(new Trip("Poland",21, TypeOfTrip.SHOPPING, Transport.BUS, Feeding.BREAKFAST));
        trips.add(new Trip("Brazil",14, TypeOfTrip.SANATORIUM, Transport.Plane, Feeding.ALL_INCLUSIVE));
        trips.add(new Trip("Romania",21, TypeOfTrip.RECREATION, Transport.Train, Feeding.ALL_INCLUSIVE));
        return trips;
    }
}
