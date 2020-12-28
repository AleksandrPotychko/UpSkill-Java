package com.epam.onedimensionalarrays;
//Даны действительные числа а1 ,а2 ,..., аn .
//Поменять местами наибольший и наименьший элементы.

public class ReplacingSmallestAndLargestNumbers {
    public static int[] replacingSmallestAndLargestNumbers(int[] array) {
        int indexMin = 0;
        int indexMax = 0;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            } else if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        int a = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = a;
        return array;
    }
}