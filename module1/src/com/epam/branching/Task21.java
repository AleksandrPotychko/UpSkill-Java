package com.epam.branching;

public class Task21 {
    private static final double SUM_OF_ANGLES = 180.0;
    private static final double RIGHT_ANGLE = 90.0;

    public static void main(String[] args) {
        double a = 90;
        double b = 45;
        double sumOfTwoAngles = a + b;
         if (a == RIGHT_ANGLE || b == RIGHT_ANGLE || sumOfTwoAngles == RIGHT_ANGLE) {
             System.out.println("This is a right-angled triangle");
         } else if (sumOfTwoAngles < SUM_OF_ANGLES) {
             System.out.println("This isn't a right-angled triangle");
         } else {
             System.out.println("A triangle with defined angles doesn't exist!");
         }
    }
}