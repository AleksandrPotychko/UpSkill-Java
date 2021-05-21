package com.epam.simplestclassesandobjects.entity;

public class Triangle {
    private Point triangleVertexA;
    private Point triangleVertexB;
    private Point triangleVertexC;


    public Triangle(Point triangleVertexA, Point triangleVertexB, Point triangleVertexC) {
        this.triangleVertexA = triangleVertexA;
        this.triangleVertexB = triangleVertexB;
        this.triangleVertexC = triangleVertexC;
    }

    public Point getTriangleVertexA() {
        return triangleVertexA;
    }

    public void setTriangleVertexA(Point triangleVertexA) {
        this.triangleVertexA = triangleVertexA;
    }

    public Point getTriangleVertexB() {
        return triangleVertexB;
    }

    public void setTriangleVertexB(Point triangleVertexB) {
        this.triangleVertexB = triangleVertexB;
    }

    public Point getTriangleVertexC() {
        return triangleVertexC;
    }

    public void setTriangleVertexC(Point triangleVertexC) {
        this.triangleVertexC = triangleVertexC;
    }
}
