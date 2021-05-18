package com.epam.decomposition;

public class ArrayInitializer {
    public static int[] buildArray(int lengthArray, int minBorder, int maxBorder) {
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = ((int) (Math.random() * maxBorder) - minBorder);
        }
        return array;
    }
}
