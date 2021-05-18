package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.Engine;
import com.epam.aggregationandcomposition.entity.Wheel;
import java.util.ArrayList;
import java.util.List;

public class CarInitializer {
    public static Engine createEngine(int power) {
        return new Engine(power);
    }

    public static Wheel createWheel(int diameter) {
        return new Wheel(diameter);
    }

    public static List<Wheel> wheelsList(int diameter) {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        return wheels;
    }
}
