package com.epam.arraysofarrays;

public class MatrixInitializer {
    public static int[][] positiveSquareMatrix (int n){
    int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = (int) (Math.random() * 100);
        }
    } return matrix;
}
    public static int [][] randomSquareMatrixWithPositiveAndNegativeElements (int n) {
        int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = ((int) (Math.random() * 100) - 50);
                }
            } return matrix;
    }
    public static int[][] randomMatrix10x20 (int rows, int columns){
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        } return matrix;
    }
}