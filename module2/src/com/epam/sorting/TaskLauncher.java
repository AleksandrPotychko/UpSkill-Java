package com.epam.sorting;

import java.util.Arrays;

public class TaskLauncher {
    private static final int LENGTH_ARRAY = 10;
    private static final int SHORT_ARRAY_LENGTH = 5;
    private static final int INSERT_INDEX_INTO_ARRAY = 3;

    public static void main(String[] args) {
        //task 1
        System.out.println(Arrays.toString(SortingImplementer.InsertArrayIntoArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY), ArrayInitializer.
                buildArray(SHORT_ARRAY_LENGTH), INSERT_INDEX_INTO_ARRAY)));

        //task 2
        System.out.println(Arrays.toString(SortingImplementer.
                applySelectionSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));

        //task 3
        System.out.println(Arrays.toString(SortingImplementer.
                applyBubbleSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));

        // task 4
        System.out.println(Arrays.toString(SortingImplementer.
                applySelectionSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));

        // task 5
        System.out.println(Arrays.toString(SortingImplementer.
                applyShellSort(ArrayInitializer.buildArray(LENGTH_ARRAY))));
    }
}