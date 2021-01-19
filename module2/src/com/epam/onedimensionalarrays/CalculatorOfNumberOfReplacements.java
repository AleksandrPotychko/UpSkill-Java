package com.epam.onedimensionalarrays;


public class CalculatorOfNumberOfReplacements {
    public static int replaceElementsAndCountReplacements(int[] array, int replacement) {
        int numberOfReplacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > replacement) {
                array[i] = replacement;
                numberOfReplacements++;
            }
        }
        return numberOfReplacements;
    }
}