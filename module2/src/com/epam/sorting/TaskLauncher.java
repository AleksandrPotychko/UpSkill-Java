package com.epam.sorting;

import java.util.Arrays;

public class TaskLauncher {
    private static final int LENGTH_ARRAY = 10;

    public static void main(String[] args) {
        //task 2
        System.out.println(Arrays.toString(SortingImplementer.
                applySelectionSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));

        //task 3
        System.out.println(Arrays.toString(SortingImplementer.
                applyBubbleSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));
    }
}