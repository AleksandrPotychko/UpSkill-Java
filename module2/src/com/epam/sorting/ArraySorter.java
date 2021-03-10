package com.epam.sorting;

public class ArraySorter {

    //task 1
    public static void insertArrayIntoArray(int[] array, int[] insertionArray, int insertIndexIntoArray) {
        int [] summaryArray = new int[array.length + insertionArray.length];

        for (int i = 0; i < (summaryArray.length - insertionArray.length + 1); i ++) {
            if ( i < insertIndexIntoArray) {
                summaryArray[i] = array[i];
            } else if (i == insertIndexIntoArray) {
                for (int j = 0; j < insertionArray.length; j++) {
                    summaryArray[i + j] = insertionArray[j];
                }
            } else if (i > insertIndexIntoArray) {
                summaryArray[i + insertionArray.length - 1] = array[i - 1];
            }
        }
    }

    // task 2
    public static void applySelectionSort(int[] array) {
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
        }
    }

    //task 3
    public static void applyBubbleSort(int[] array) {
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
        }
    }

    //task 4
    public static void applyInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; array[j - 1] > array[j]; j--) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }

    //task 5
    public static void applyShellSort(int[] array) {
        for (int step = array.length / 2; step > 0 ; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }
        }
    }
}