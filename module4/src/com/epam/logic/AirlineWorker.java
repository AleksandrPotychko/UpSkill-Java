package com.epam.logic;

import com.epam.entity.Airline;

public class AirlineWorker {
    public static Airline findPlaneForDestination(Airline airline, String destinationPoint) {
        Airline planeForDestination = null;
        if (destinationPoint.equals(airline.getDestinationPoint())) {
            planeForDestination = airline;
        }
        return planeForDestination;
    }

    public static Airline findPlaneForWeekDay(Airline airline, String weekDay) {
        Airline planeForWeekDay = null;
        String[] weekDays = airline.getWeekDays();
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDay.equals(weekDays[i])) {
                planeForWeekDay = airline;
            }
        }
        return planeForWeekDay;
    }

    public static Airline findPlaneForWeekDayAndDepartureTime(Airline airline, String weekDay, double departureTime) {
        Airline plane = null;
        String[] weekDays = airline.getWeekDays();
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDay.equals(weekDays[i])) {
                if (departureTime < airline.getDepartureTime()) {
                    plane = airline;
                }
            }
        }
        return plane;
    }
}
