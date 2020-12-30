package com.epam.onedimensionalarrays;
//Дана последовательность целых чисел а1 ,а2 ,..., аn.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

public class DeleteMinValueOfArray {
    public static int[] deleteMinValue(int[] array) {
        int minCount = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }
        int[] newArray = new int[array.length - minCount];
        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArray[indexResult] = array[i];
                indexResult++;
            }
        }
        return newArray;
    }
}