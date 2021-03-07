package com.epam.sorting;

public class SortingImplementer {

    //task 1
    public static int[] InsertArrayIntoArray(int[] longArray, int[] shortArray, int insertIndexIntoArray) {
        int [] summaryArray = new int[longArray.length + shortArray.length];

        for (int i = 0; i < (summaryArray.length - shortArray.length + 1); i ++) {
            if ( i < insertIndexIntoArray) {
                summaryArray[i] = longArray[i];
            } else if (i == insertIndexIntoArray) {
                for (int j = 0; j < shortArray.length; j++) {
                    summaryArray[i + j] = shortArray[j];
                }
            } else if (i > insertIndexIntoArray) {
                summaryArray[i + shortArray.length - 1] = longArray[i - 1];
            }
        } return  summaryArray;
    }

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

    //task 4
    public static int[] applyInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; array[j - 1] > array[j]; j--) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        } return array;
    }

    //task 5
    public static int[] applyShellSort(int[] array) {
        for (int step = array.length / 2; step > 0 ; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }
        } return array;
    }
}