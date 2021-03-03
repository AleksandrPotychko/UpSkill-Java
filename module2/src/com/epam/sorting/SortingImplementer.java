package com.epam.sorting;

public class SortingImplementer {
    // task 2
    public static int[] applySelectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minimalNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimalNumber]) {
                    minimalNumber = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimalNumber];
            array[minimalNumber] = temp;
        } return array;
    }

    //task 3
    public static int[] applyBubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                isSorted = false;
            }
        }
        } return array;
    }
}