package com.epam.onedimensionalarrays;

public class ArraySumm {
    private static final int DIVIDER = 2;

    public static void sumElements() {
        int arrayLength = 10;
        int [] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        int i = 0;
        int sumElements = 0;
        if (array[i] % DIVIDER == 0) {
            sumElements =+ array[i];
            i++;
        }
        System.out.println("Sum of elements  = " + sumElements);
    }
}

