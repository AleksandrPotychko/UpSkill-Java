package com.epam.onedimensionalarrays;

public class ArrayWorker {
    int sumOfArrayElements = 0;
    public void SumOfArrayElements(int[] array, int divider) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sumOfArrayElements += array[i];
            }
        }
    }
}