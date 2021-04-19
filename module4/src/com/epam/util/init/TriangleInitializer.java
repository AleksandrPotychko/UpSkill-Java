package com.epam.util.init;

import com.epam.entity.Points;
import com.epam.entity.Triangle;

public class TriangleInitializer {
    public static Triangle createTriangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        Points pointA = new Points(aX, aY);
        Points pointB = new Points(bX, bY);
        Points pointC = new Points(cX, cY);
        return new Triangle(pointA, pointB, pointC);
    }
}