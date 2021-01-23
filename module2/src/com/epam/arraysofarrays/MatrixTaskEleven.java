package com.epam.arraysofarrays;


public class MatrixTaskEleven {
    public static void matrixTaskEleven(int[][] matrix) {
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) count += 1;
            }
            if (count >= 3) {
                int k = i + 1;
                System.out.println("A row with more than three 5 : " + k);
            }
        }
    }
}