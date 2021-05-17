package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.City;
import com.epam.aggregationandcomposition.entity.District;
import com.epam.aggregationandcomposition.entity.Region;
import java.util.ArrayList;
import java.util.List;

public class StateInitializer {
    public static City city(String nameCity) {
        return new City(nameCity);
    }

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
        districts.add(new District(("Minskiy"), StateInitializer.createCities()));
        districts.add(new District(("Vitebskiy"), StateInitializer.createCities()));
        districts.add(new District(("Mogilevskiy"), StateInitializer.createCities()));
        districts.add(new District(("Orshanskiy"), StateInitializer.createCities()));
        districts.add(new District(("Grodnenskiy"), StateInitializer.createCities()));
        return districts;
    }

    public static List<Region> createRegions() {
        City firstCity = new City("Smolensk");
        City secondCity = new City("Warsaw");
        City thirdCity = new City("Berlin");
        List<Region> regions = new ArrayList<>();
        regions.add(new Region("Minskaya", StateInitializer.createDistricts(),firstCity));
        regions.add(new Region("Orshanskaya", StateInitializer.createDistricts(),secondCity));
        regions.add(new Region("Mogilevskaya", StateInitializer.createDistricts(),thirdCity));
        return regions;
    }
}
