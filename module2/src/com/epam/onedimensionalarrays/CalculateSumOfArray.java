package com.epam.onedimensionalarrays;

public class CalculateSumOfArray {
    public static int calculateSumOfArray(int[] array, int divider) {
        int sum = 0;
        for (int i =0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}