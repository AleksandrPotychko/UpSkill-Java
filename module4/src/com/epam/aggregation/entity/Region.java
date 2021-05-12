package com.epam.aggregation.entity;

import java.util.List;
import java.util.Objects;

public class Region {
    private String name;
    private List<District> districts;
    private City regionalCenter;

    public Region(String name, List<District> districts, City regionalCenter) {
        this.name = name;
        this.districts = districts;
        this.regionalCenter = regionalCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
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
        Region region = (Region) o;
        return Objects.equals(name, region.name) && Objects.equals(districts, region.districts) && Objects.equals(regionalCenter, region.regionalCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, districts, regionalCenter);
    }

    @Override
    public String toString() {
        return "Region: " + name +
                ": districts = " + districts +
                ", regional center = " + regionalCenter +
                '}' + "\n";
    }
}
