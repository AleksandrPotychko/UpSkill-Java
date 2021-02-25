package com.epam.arraysofarrays;

import java.util.Arrays;

public class MatrixSorter {
    //task 12
    public static void sortRows(int[][] matrix, boolean descendingOrder) {
        for (int[] row : matrix) {
            Arrays.sort(row);
        }
        if (descendingOrder) {
            for (int i = 0; i < matrix.length; i++) {
                int lastItemIndex = matrix[i].length - 1;
                int middleOfRow = matrix[i].length / 2;
                int tempItem;
                for (int j = 0; j < middleOfRow; j++) {
                    tempItem = matrix[i][j];
                    matrix[i][j] = matrix[i][lastItemIndex - j];
                    matrix[i][lastItemIndex - j] = tempItem;
                }
            }
        }
    }
    // task 13
    public static void sortColumns(int[][] matrix, boolean descendingOrder) {
        int[] tempColumn = new int[matrix.length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                tempColumn[i] = matrix[i][j];
            }
            Arrays.sort(tempColumn);
            if (descendingOrder) {
                int lastItemIndex = tempColumn.length - 1;
                int middleOfColumn = tempColumn.length / 2;
                int tempItem;
                for (int z = 0; z < middleOfColumn; z++) {
                    tempItem = tempColumn[z];
                    tempColumn[z] = tempColumn[lastItemIndex - z];
                    tempColumn[lastItemIndex - z] = tempItem;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = tempColumn[i];
            }
        }
    }
    //task 15
    private static int findMaxElementMatrix(int[][] matrix) {
        int maxElement = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }
    public static void replaceOddNumbersOnMaxElement(int[][] matrix) {
        int maxElement = findMaxElementMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }
    }
}