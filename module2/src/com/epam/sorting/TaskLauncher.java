package com.epam.sorting;

import java.util.Arrays;

public class TaskLauncher {
    private static final int LENGTH_ARRAY = 10;
    private static final int SHORT_ARRAY_LENGTH = 5;
    private static final int INSERT_INDEX_INTO_ARRAY = 3;
    private static final int MIN_BORDER = 0;
    private static final int MAX_BORDER = 1000;

    public static void main(String[] args) {
        //task 1
        ArraySorter.insertArrayIntoArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MAX_BORDER, MIN_BORDER), ArrayInitializer.
                buildArray(SHORT_ARRAY_LENGTH, MAX_BORDER, MIN_BORDER), INSERT_INDEX_INTO_ARRAY);

        //task 2
        ArraySorter.applySelectionSort(ArrayInitializer.buildArray(LENGTH_ARRAY, MAX_BORDER, MIN_BORDER));

        //task 3
        ArraySorter.applyBubbleSort(ArrayInitializer.buildArray(LENGTH_ARRAY, MAX_BORDER, MIN_BORDER));

        // task 4
        ArraySorter.applyInsertionSort(ArrayInitializer.buildArray(LENGTH_ARRAY, MAX_BORDER, MIN_BORDER));

        // task 5
        ArraySorter.applyShellSort(ArrayInitializer.buildArray(LENGTH_ARRAY, MAX_BORDER, MIN_BORDER));
    }
}