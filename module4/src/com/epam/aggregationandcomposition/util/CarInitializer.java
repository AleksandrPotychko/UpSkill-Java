package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.Wheel;
import java.util.ArrayList;
import java.util.List;

public class CarInitializer {
    public static List<Wheel> wheelsList(int diameter) {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        wheels.add(new Wheel(diameter));
        return wheels;
    }
}
