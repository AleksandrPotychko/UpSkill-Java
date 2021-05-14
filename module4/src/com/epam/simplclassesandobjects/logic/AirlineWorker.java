package com.epam.simplclassesandobjects.logic;

import com.epam.simplclassesandobjects.entity.Airline;
import java.util.ArrayList;
import java.util.List;

public class AirlineWorker {
    public static List<Airline> findPlanesForDestination(Airline[] airlines, String destinationPoint) {
        List<Airline> planesForDestination = new ArrayList<>();
        for (int i = 0; i < airlines.length; i++) {
            if (destinationPoint.equals(airlines[i].getDestinationPoint())) {
                planesForDestination.add(airlines[i]);
            }
        }
        return planesForDestination;
    }

    public static List<Airline> findPlanesForWeekDay(Airline[] airlines, String weekDay) {
        List<Airline> planesForWeekDay = new ArrayList<>();
        for (int i = 0; i < airlines.length; i++) {
            String[] weekDays = airlines[i].getWeekDays();
            for (int j = 0; j < weekDays.length; j++) {
                if (weekDay.equals(weekDays[j])) {
                    planesForWeekDay.add(airlines[i]);
                }
            }
        }
        return planesForWeekDay;
    }

    public static List<Airline> findPlanesForDepartureTime(ArrayList<Airline> airlines,
                                                                          double departureTime) {
        List<Airline> planesDepartureTime = new ArrayList<>();
        for (int i = 0; i < airlines.size(); i++) {
            if (departureTime < airlines.get(i).getDepartureTime()) {
                planesDepartureTime.add(airlines.get(i));
            }
        }
        return planesDepartureTime;
    }
}
