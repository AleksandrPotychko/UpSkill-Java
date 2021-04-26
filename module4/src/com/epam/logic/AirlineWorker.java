package com.epam.logic;

import com.epam.entity.Airline;

public class AirlineWorker {
    public static Airline findPlanesForDestination(Airline airline, String destinationPoint) {
        Airline airline1 = null;
        if (destinationPoint.equals(airline.getDestinationPoint())) {
            airline1 = airline;
        }
        return airline1;
    }

    public static Airline findPlanesForWeekDay(Airline airline, String weekDay) {
        Airline airline1 = null;
        String[] weekDays = airline.getWeekDays();
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDay.equals(weekDays[i])) {
                airline1 = airline;
            }
        }
        return airline1;
    }

    public static Airline findPlanesForWeekDayAndDepartureTime(Airline airline, String weekDay, double departureTime) {
        Airline airline1 = null;
        String[] weekDays = airline.getWeekDays();
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDay.equals(weekDays[i])) {
                if (departureTime < airline.getDepartureTime()) {
                    airline1 = airline;
                }
            }
        }
        return airline1;
    }
}
