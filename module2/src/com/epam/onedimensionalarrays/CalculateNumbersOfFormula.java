package com.epam.onedimensionalarrays;


public class CalculateNumbersOfFormula {
    public static int calculateNumbersOfFormula(int[] array) {
        int max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > max) {
                max = array[i] + array[array.length - i - 1];
            }
        }
        return max;
    }
}