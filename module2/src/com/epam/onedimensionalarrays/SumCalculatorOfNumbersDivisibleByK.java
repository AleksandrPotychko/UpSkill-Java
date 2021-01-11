package com.epam.onedimensionalarrays;

public class SumCalculatorOfNumbersDivisibleByK {
    public static int countSum(int[] array, int divider) {
        int sum = 0;
        for (int number : array) {
            if (number % divider == 0) {
                sum += number;
            }
        }
        return sum;
    }
}