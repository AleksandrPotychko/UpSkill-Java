package com.epam.onedimensionalarrays;


public class NumbersMaxMinElementsSwapper {
    public void swapElements(int[] array) {
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
        int tmp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = tmp;
    }
}