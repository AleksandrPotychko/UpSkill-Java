package com.epam.onedimensionalarrays;

public class DeleteMinValueOfArray {
    public static int[] deleteMinValue(int[] array) {
        int minCount = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }
        int[] arrayWithoutMiniValue = new int[array.length - minCount];
        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                arrayWithoutMiniValue[indexResult] = array[i];
                indexResult++;
            }
        }
        return arrayWithoutMiniValue;
    }
}