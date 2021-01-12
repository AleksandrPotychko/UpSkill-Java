package com.epam.onedimensionalarrays;

public class MostRecurringNumber {
    public static int getMostPopularNumber(int[] array) {
        int[] arrayCountOfPopularNumber = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    arrayCountOfPopularNumber[i]++;
                }
            }
        }
        int mostPopularNumber = array[0];
        int comparativeVariable = arrayCountOfPopularNumber[0];
        for (int i = 0; i < arrayCountOfPopularNumber.length; i++) {
            if (arrayCountOfPopularNumber[i] > comparativeVariable) {
                comparativeVariable = arrayCountOfPopularNumber[i];
                mostPopularNumber = array[i];
            }
            if ((comparativeVariable == arrayCountOfPopularNumber[i]) && (array[i] < mostPopularNumber)) {
                mostPopularNumber = array[i];
            }
        }
        return mostPopularNumber;
    }
}