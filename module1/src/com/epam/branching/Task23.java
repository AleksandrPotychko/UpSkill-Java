package com.epam.branching;

public class Task23 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 8;
        double x3 = 3;
        double y3 = 3;
        if ((x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2)){
            System.out.println("All points are on one line.");
        } else {
            System.out.println("All points are not on one line.");
        }
    }
}
