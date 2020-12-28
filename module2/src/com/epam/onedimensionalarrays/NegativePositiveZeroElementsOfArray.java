package com.epam.onedimensionalarrays;
//Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class NegativePositiveZeroElementsOfArray {
    int negativeElements = 0;
    int positiveElements = 0;
    int zeroElements = 0;
    public void negativePositiveZeroElementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElements++;
            } else if (array[i] > 0) {
                positiveElements++;
            } else {
                zeroElements++;
            }
        }
    }
}
