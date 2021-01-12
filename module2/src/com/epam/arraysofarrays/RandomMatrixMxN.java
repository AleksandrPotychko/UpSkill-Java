package com.epam.arraysofarrays;
// task 14

public class RandomMatrixMxN {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20);
        int m = (int) (Math.random() * 10);
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if( i <= j )  {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}