package com.epam.simplclassesandobjects.util.init;

import com.epam.simplclassesandobjects.entity.Airline;

public class AirlineAggregator {
    public static Airline[] createAirline(int capacity) {
        Airline[] airlines = new Airline[capacity];
        airlines[0] = new Airline("Minsk", 100,"Narrow fuselage plane",
                11.20, new String[]{"Monday", "Tuesday", "Wednesday"});
        airlines[1] = new Airline("Vitebsk", 77,"Wide-body aircraft",
                7.11, new String[]{"Thursday", "Friday", "Saturday", "Sunday"});
        airlines[2] = new Airline("Minsk", 23,"Narrow fuselage plane",
                22.14, new String[]{"Monday", "Wednesday",});
        airlines[3] = new Airline("London", 527,"Wide-body aircraft",
                16.57, new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"});
        airlines[4] = new Airline("Moscow", 387,"Narrow fuselage plane",
                7.00, new String[]{"Saturday", "Sunday"});
        airlines[5] = new Airline("Dubai", 11,"Wide-body aircraft",
                17.07, new String[]{"Wednesday", "Thursday", "Friday"});
        airlines[6] = new Airline("Dubai", 673,"Narrow fuselage plane",
                23.30, new String[]{"Monday"});
        return airlines;
    }
}
