package com.epam.arraysofarrays;

public class MatrixSorter {
    //task 12 Ascending
    public static int[][] sortRowsAscendingOrder (int[][] matrix) {
        for(int k = 0; k < matrix.length; k++) {
            for(int i = 0; i < (matrix.length - 1); i++) {
                for(int j = 0; j < matrix.length - i - 1; j++) {
                    if(matrix[k][j] > matrix[k][j + 1]) {
                        int swapped = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = swapped;
                    }
                }
            }
        }
        return matrix;
    }
    //task 12 Descending
    public static int[][] sortRowsDescendingOrder (int[][] matrix) {
        for(int k = 0; k < matrix.length; k++) {
            for(int i = 0; i < (matrix.length - 1); i++) {
                for(int j = 0; j < matrix.length - i - 1; j++) {
                    if(matrix[k][j] < matrix[k][j + 1]) {
                        int swapped = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = swapped;
                    }
                }
            }
        }
        return matrix;
    }
    // task 13 Ascending
    public static int[][] sortColumnsAscendingOrder (int[][] matrix) {
        for(int k = 0; k < matrix.length; k++) {
            for(int i = 0; i < matrix.length; i++) {
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
    }
    // task 13 Ascending
    public static int[][] sortColumnsDescendingOrder (int[][] matrix) {
        for(int k = 0; k < matrix.length; k++) {
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
    //task 15
    public static void findMaxMatrixElementAndReplaceItNegativeNumbers(int[][] matrix) {
        int maxElement = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ( matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0){
                    matrix[i][j] = maxElement;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}