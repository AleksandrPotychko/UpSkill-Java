package com.epam.simpleclassesandobects.util.init;

import com.epam.simpleclassesandobects.entity.Point;
import com.epam.simpleclassesandobects.entity.Triangle;

public class TriangleInitializer {
    public static Triangle createTriangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        Point pointA = new Point(aX, aY);
        Point pointB = new Point(bX, bY);
        Point pointC = new Point(cX, cY);
        return new Triangle(pointA, pointB, pointC);
    }
}
