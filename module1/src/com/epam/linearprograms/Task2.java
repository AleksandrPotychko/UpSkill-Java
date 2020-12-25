package com.epam.linearprograms;

public class Task2 {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 7.0;
        double c = 2.0;
        if ((b * b + 4 * a * c >= 0) || a != 0 || b != 0) {
            System.out.println("Value of formula = " + (((b + Math.sqrt(Math.pow(b, 2) +  4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2)));
        }
    }
}