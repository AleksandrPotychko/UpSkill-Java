package com.epam.aggregation.logic;

import com.epam.aggregation.entity.City;
import com.epam.aggregation.entity.District;
import com.epam.aggregation.entity.Region;
import com.epam.aggregation.entity.State;

import java.util.ArrayList;
import java.util.List;

public class StateAggregator {
    public static List<City> createCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Minsk"));
        cities.add(new City("Orsha"));
        cities.add(new City("Vitebsk"));
        cities.add(new City("Kopishche"));
        cities.add(new City("Paris"));
        return cities;
    }

    public static List<District> createDistricts() {
        List<District> districts = new ArrayList<>();
        districts.add(new District(("Minskiy"), StateAggregator.createCities()));
        districts.add(new District(("Vitebskiy"), StateAggregator.createCities()));
        districts.add(new District(("Mogilevskiy"), StateAggregator.createCities()));
        districts.add(new District(("Orshanskiy"), StateAggregator.createCities()));
        districts.add(new District(("Grodnenskiy"), StateAggregator.createCities()));
        return districts;
    }

    public static List<Region> createRegions() {
        City firstCity = new City("Smolensk");
        City secondCity = new City("Warsaw");
        City thirdCity = new City("Berlin");
        List<Region> regions = new ArrayList<>();
        regions.add(new Region("Minskaya", StateAggregator.createDistricts(),firstCity));
        regions.add(new Region("Orshanskaya", StateAggregator.createDistricts(),secondCity));
        regions.add(new Region("Mogilevskaya", StateAggregator.createDistricts(),thirdCity));
        return regions;
    }

    public static void printCapital(State state) {
        City capital = state.getCapital();
        System.out.println("Capital " + state.getName() + ": " + capital.getCityName());
    }

    public static void printNumberOfRegions(State state) {
        System.out.println("Number of regions in " + state.getName() + " : " + state.getRegions().size());
    }

    public static void printStateArea(State state) {
        System.out.println("State area of the " + state.getName() + " : " + state.getStateArea());
    }

    public static void printRegionalCenter(State state) {
        int count = state.getRegions().size();
        List<String> namesRegionalCenter = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            namesRegionalCenter.add(state.getRegions().get(i).getRegionalCenter().getCityName());
        }
        System.out.println("Name regional centers : " + namesRegionalCenter);
    }
}
