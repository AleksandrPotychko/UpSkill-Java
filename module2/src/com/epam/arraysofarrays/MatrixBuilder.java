package com.epam.arraysofarrays;

public class MatrixBuilder {
    //task 4 notFixed
    public static  int[][] buildMatrixAccordingToPattern(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 ==0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }
            }
        }
        return matrix;
    }
    // task 5
    public static int[][] buildMatrixForTaskFive(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n) {
                    matrix[i][j] = i + 1;
                }
            }
        }
        return matrix;
    }
    // task 6
    public static int[][] buildMatrixForTaskSix(int n) {
        int[][] matrix = new int[n][n];
        int halfMatrixLength = n / 2;
        final int rowBeforeMiddle = halfMatrixLength - 1;
        int numberOfZeros = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = numberOfZeros; j < (matrix[i].length - numberOfZeros); j++) {
                matrix[i][j] = 1;
            }
            if (i < rowBeforeMiddle) {
                numberOfZeros++;
            } else if (i > rowBeforeMiddle) {
                numberOfZeros--;
            }
        }
        return matrix;
    }
    //task 7 notFixed
    public static int buildMatrixAndCalculatePositiveElements(int n) {
        int positiveElements = 0;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] >= 0) {
                    positiveElements++;
                }
            }
        }
        return positiveElements;
    }
}