package com.epam.aggregationandcomposition.entity;

import java.util.Objects;

public class Feeding implements Comparable<Feeding> {
    private String typeFeeding;

    private Feeding(String typeFeeding) {
        this.typeFeeding = typeFeeding;
    }

    public static Feeding BREAKFAST = new Feeding("Breakfast");
    public static Feeding ALL_INCLUSIVE = new Feeding("All inclusive");
    public static Feeding WITHOUT_FOOD = new Feeding("Without food");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feeding feeding = (Feeding) o;
        return Objects.equals(typeFeeding, feeding.typeFeeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFeeding);
    }

    @Override
    public String toString() {
        return "Feeding: " + typeFeeding;
    }

    @Override
    public int compareTo(Feeding o) {
        return typeFeeding.compareTo(o.typeFeeding);
    }
}
