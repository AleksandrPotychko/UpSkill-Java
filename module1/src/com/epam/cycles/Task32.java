package com.epam.cycles;

public class Task32 {
    private static final double CONDITION_PARAMETER = 2.0;
    public static void main(String[] args) {
        double a = 1;
        double b = 10;
        double h = 1;
        for(double x = a; x <=  b; x += h) {
            if (x > CONDITION_PARAMETER) {
                System.out.println("y = " + -x + " (x = " + x + ")");
            } else {
                System.out.println("y = " + x + " (x = " + x + ")");
            }
        }
    }
}
