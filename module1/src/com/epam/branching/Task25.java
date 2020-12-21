package com.epam.branching;

public class Task25 {
    public static void main(String[] args) {
        double x = 3;
        if(x <= 3) {
            System.out.println((Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println((1 / (Math.pow(x, 3) + 6)));
        }
    }
}
