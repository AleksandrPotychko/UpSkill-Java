package com.epam.onedimensionalarrays;


public class EverySecondElementEqualsZero {
    public static double[] buildNewArray (double[] array) {
        int currentWritingIndex = 0;
        for (int currentReadingIndex = 0; currentReadingIndex < array.length; currentReadingIndex += 2,
                currentWritingIndex++) {
            array[currentWritingIndex] = array[currentReadingIndex];
        }
        for (int i = (int) Math.round(array.length / 2.0); i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
}