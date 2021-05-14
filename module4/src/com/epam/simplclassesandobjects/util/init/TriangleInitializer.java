package com.epam.simplclassesandobjects.util.init;

import com.epam.simplclassesandobjects.entity.Point;
import com.epam.simplclassesandobjects.entity.Triangle;

public class TriangleInitializer {
    public static Triangle createTriangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        Point pointA = new Point(aX, aY);
        Point pointB = new Point(bX, bY);
        Point pointC = new Point(cX, cY);
        return new Triangle(pointA, pointB, pointC);
    }
}
