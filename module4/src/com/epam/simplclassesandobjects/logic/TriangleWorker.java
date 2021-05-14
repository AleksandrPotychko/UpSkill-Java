package com.epam.simplclassesandobjects.logic;

import com.epam.simplclassesandobjects.entity.Point;
import com.epam.simplclassesandobjects.entity.Triangle;

public class TriangleWorker {
    public static double calculateSquare(Triangle triangle) {
        double sideAB = sideLength(triangle.getTriangleVertexA(), triangle.getTriangleVertexB());
        double sideBC = sideLength(triangle.getTriangleVertexB(), triangle.getTriangleVertexC());
        double sideAC = sideLength(triangle.getTriangleVertexA(), triangle.getTriangleVertexC());
        double semiPerimeter = calculatePerimeter(triangle) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideAC));
    }

    public static double calculatePerimeter(Triangle triangle) {
        double sideAB = sideLength(triangle.getTriangleVertexA(), triangle.getTriangleVertexB());
        double sideBC = sideLength(triangle.getTriangleVertexB(), triangle.getTriangleVertexC());
        double sideAC = sideLength(triangle.getTriangleVertexA(), triangle.getTriangleVertexC());
        return sideAB + sideBC + sideAC;
    }

    public static Point findIntersectionPointOfTheMedians(Triangle triangle) {
        return new Point((triangle.getTriangleVertexA().getCoordinateX() + triangle.getTriangleVertexB().
                getCoordinateX() + triangle.getTriangleVertexC().getCoordinateX()) / 3,
                (triangle.getTriangleVertexA().getCoordinateY() + triangle.getTriangleVertexB().
                        getCoordinateY() + triangle.getTriangleVertexC().getCoordinateY()) / 3);
    }

    private static double sideLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getCoordinateX() - pointA.
                getCoordinateX(), 2) + Math.pow(pointB.getCoordinateY() - pointA.getCoordinateY(), 2));
    }
}
