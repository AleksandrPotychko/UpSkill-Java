package com.epam.aggregationandcomposition.entity;

import java.util.List;
import java.util.Objects;

public class State {
    private String name;
    private List<Region> regions;
    private City capital;
    private int stateArea;

    public State(String name, List<Region> regions, City capital, int stateArea) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;
        this.stateArea = stateArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public int getStateArea() {
        return stateArea;
    }

    public void setStateArea(int stateArea) {
        this.stateArea = stateArea;
    }

    public void printCapital() {
        System.out.println("The capital of the " + getName() + " is " + getCapital());
    }

    public void printNumberOfRegions() {
        System.out.println("Number of regions in " + getName() + ": " + getRegions().size());
    }

    public void printStateArea() {
        System.out.println("State area = " + getStateArea());
    }

    public void printRegionalCenters() {
        int count = getRegions().size();
        for(int i = 0; i < count; i++) {
            getRegions().get(i).printRegionalCenter();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return stateArea == state.stateArea && Objects.equals(name, state.name) && Objects.equals(regions, state.regions) && Objects.equals(capital, state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regions, capital, stateArea);
    }

    @Override
    public String toString() {
        return "State: " + name +
                regions +
                "Capital " + capital + "\n" +
                "State area = " + stateArea +
                '.';
    }
}
