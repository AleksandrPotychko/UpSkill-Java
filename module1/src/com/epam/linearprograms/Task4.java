package com.epam.linearprograms;

public class Task4 {
    public static void main(String[] args) {
        double r = 334.652;
        System.out.println("The inverted number = " + ((r * 1000) % 1000 + (int) r / 1000.0));
    }
}
