package com.epam.onedimensionalarrays;

public class SumCalculatorOfNumbersDivisibleByK {
    public static int countSum(int[] array, int divider) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}