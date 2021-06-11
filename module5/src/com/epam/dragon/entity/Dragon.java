package com.epam.dragon.entity;

import java.util.Arrays;
import java.util.Objects;

public class Dragon {
    private String name;
    private Treasure[] treasures;

    public Dragon(String name, Treasure[] treasures) {
        this.name = name;
        this.treasures = treasures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(name, dragon.name) && Arrays.equals(treasures, dragon.treasures);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(treasures);
        return result;
    }

    @Override
    public String toString() {
        return "Dragon { " +
                name +
                Arrays.toString(treasures) +
                '}';
    }
}
