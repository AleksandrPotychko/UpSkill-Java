package com.epam.dragon.entity;

import java.util.List;
import java.util.Objects;

public class Dragon {
    private String name;
    private List<Treasure> treasures;

    public Dragon(String name, List<Treasure> treasures) {
        this.name = name;
        this.treasures = treasures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(name, dragon.name) && Objects.equals(treasures, dragon.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, treasures);
    }

    @Override
    public String toString() {
        return "Dragon{ " +
                name +
                ", treasures = " + treasures +
                '}';
    }
}
