package com.epam.entity;

public class Triangle {
    private Points triangleVertexA;
    private Points triangleVertexB;
    private Points triangleVertexC;


    public Triangle(Points triangleVertexA, Points triangleVertexB, Points triangleVertexC) {
        this.triangleVertexA = triangleVertexA;
        this.triangleVertexB = triangleVertexB;
        this.triangleVertexC = triangleVertexC;
    }

    public Points getTriangleVertexA() {
        return triangleVertexA;
    }

    public void setTriangleVertexA(Points triangleVertexA) {
        this.triangleVertexA = triangleVertexA;
    }

    public Points getTriangleVertexB() {
        return triangleVertexB;
    }

    public void setTriangleVertexB(Points triangleVertexB) {
        this.triangleVertexB = triangleVertexB;
    }

    public Points getTriangleVertexC() {
        return triangleVertexC;
    }

    public void setTriangleVertexC(Points triangleVertexC) {
        this.triangleVertexC = triangleVertexC;
    }
}