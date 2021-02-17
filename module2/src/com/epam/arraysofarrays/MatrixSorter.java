package com.epam.arraysofarrays;

public class MatrixSorter {
    //task 12
    public static int[][] sortRowsAscendingOrDescending(int[][] matrix, boolean ascending) {
        if (ascending) {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < (matrix.length - 1); i++) {
                    for (int j = 0; j < matrix.length - i - 1; j++) {
                        if (matrix[k][j] > matrix[k][j + 1]) {
                            int swapped = matrix[k][j];
                            matrix[k][j] = matrix[k][j + 1];
                            matrix[k][j + 1] = swapped;
                        }
                    }
                }
            }
            return matrix;
        } else {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < (matrix.length - 1); i++) {
                    for (int j = 0; j < matrix.length - i - 1; j++) {
                        if (matrix[k][j] < matrix[k][j + 1]) {
                            int swapped = matrix[k][j];
                            matrix[k][j] = matrix[k][j + 1];
                            matrix[k][j + 1] = swapped;
                        }
                    }
                }
            }
            return matrix;
        }
    }
    // task 13
    public static int[][] sortColumnsAscendingOrDescending(int[][] matrix, boolean ascending) {
        if (ascending) {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - i - 1; j++) {
                        if (matrix[j][k] > matrix[j + 1][k]) {
                            int swapped = matrix[j][k];
                            matrix[j][k] = matrix[j + 1][k];
                            matrix[j + 1][k] = swapped;
                        }
                    }
                }
            }
            return matrix;
        } else {
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length - i - 1; j++) {
                        if (matrix[j][k] < matrix[j + 1][k]) {
                            int swapped = matrix[j][k];
                            matrix[j][k] = matrix[j + 1][k];
                            matrix[j + 1][k] = swapped;
                        }
                    }
                }
            }
            return matrix;
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