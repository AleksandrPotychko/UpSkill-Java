package com.epam.onedimensionalarrays;

public class ArraySum {
    private static final int DIVIDERR = 2;
    private static int sumElement = 0;

    public static void main(String[] args) {
        int arrayLength = 10;
        int [] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        int i = 0;
        if (array[i] % DIVIDERR == 0) {
            sumElement =+ array[i];
            i++;
        }
        System.out.println("Sum of elements  = " + sumElement);
    }
}