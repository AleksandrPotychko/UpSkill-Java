package com.epam.onedimensionalarrays;


public class RealNumbersArrayAnalyser {

    public static int[] characterizeArray(int[] array, int negativeElements, int positiveElements, int zeroElements) {
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