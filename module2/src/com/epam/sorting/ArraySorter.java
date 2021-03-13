package com.epam.sorting;

public class ArraySorter {

    //task 1
    public static int[] insertArrayIntoArray(int[] firstArray, int[] secondArray, int insertionIndex) {
        int[] concatenatedArray = null;
        if (insertionIndex > 0 && insertionIndex < firstArray.length - 1) {
            concatenatedArray = new int[firstArray.length + secondArray.length];
            int indexOfWriting = 0;
            for (int i = 0; i <= insertionIndex; i++) {
                concatenatedArray[indexOfWriting++] = firstArray[i];
            }
            for (int i = 0; i < secondArray.length; i++) {
                concatenatedArray[indexOfWriting++] = secondArray[i];
            }
            for (int i = insertionIndex + 1; i < firstArray.length; i++) {
                concatenatedArray[indexOfWriting++] = firstArray[i];
            }
        }
        return concatenatedArray;
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
        }
        return array;
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
        }
        return array;
    }

    //task 4
    public static int[] applyInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
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
        }
        return array;
    }
}