package com.epam.onedimensionalarrays;


public class RealNumbersArrayAnalyser {

    public static int[] characterizeArray(int[] array) {
        int negativeElements = 0, zeroElements = 0, positiveElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElements++;
            } else if (array[i] > 0) {
                positiveElements++;
            } else {
                zeroElements++;
            }
        }
        int[] result = new int[]{negativeElements, positiveElements, zeroElements};
        return result;
    }
}