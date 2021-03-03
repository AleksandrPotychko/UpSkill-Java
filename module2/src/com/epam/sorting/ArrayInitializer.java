package com.epam.sorting;

public class ArrayInitializer {
    public static int[] buildArray(int lengthArray) {
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 1000));
        } return array;
    }
}