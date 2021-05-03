package com.epam.logic;

import com.epam.entity.Airline;
import java.util.ArrayList;

public class AirlineWorker {
    public static ArrayList<Airline> findPlanesForDestination(Airline[] airlines, String destinationPoint) {
        ArrayList<Airline> planesForDestination = new ArrayList<>();
        for (int i = 0; i < airlines.length; i++) {
            if (destinationPoint.equals(airlines[i].getDestinationPoint())) {
                planesForDestination.add(airlines[i]);
            }
        }
        return planesForDestination;
    }

    public static ArrayList<Airline> findPlanesForWeekDay(Airline[] airlines, String weekDay) {
        ArrayList<Airline> planesForWeekDay = new ArrayList<>();
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

    public static ArrayList<Airline> findPlanesForDepartureTime(ArrayList<Airline> airlines,
                                                                          double departureTime) {
        ArrayList<Airline> planesDepartureTime = new ArrayList<>();
        for (int i = 0; i < airlines.size(); i++) {
            if (departureTime < airlines.get(i).getDepartureTime()) {
                planesDepartureTime.add(airlines.get(i));
            }
        }
        return planesDepartureTime;
    }
}
