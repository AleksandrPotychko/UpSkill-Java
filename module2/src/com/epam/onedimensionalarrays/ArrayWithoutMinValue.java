package com.epam.onedimensionalarrays;

public class ArrayWithoutMinValue {
    public static int[] findAndDeleteMinValue(int[] array) {
        int counterOfMinValues = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        for (int value : array) {
            if (value == min) {
                counterOfMinValues++;
            }
        }
        int[] arrayWithoutMiniValue = new int[array.length - counterOfMinValues];
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