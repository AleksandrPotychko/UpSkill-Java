package com.epam.aggregationandcomposition.entity;

import java.util.List;
import java.util.Objects;

public class District {
    private String name;
    private List<City> cities;

    public District(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(name, district.name) && Objects.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cities);
    }

    @Override
    public String toString() {
        return "District " + name +
                ": cities = " + cities +
                '.';
    }
}
