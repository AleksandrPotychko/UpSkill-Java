package com.epam.arraysofarrays;

public class MatrixInitializer {
    public static int [][] buildRandomSquareMatrix(int n, int minBorder, int maxBorder) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ((int) (Math.random() * maxBorder) - minBorder);
            }
        }
        return matrix;
    }

    public static int[][] buildRandomMatrixForEleventhTask(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        return matrix;
    }
}