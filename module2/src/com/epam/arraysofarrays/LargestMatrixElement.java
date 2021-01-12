package com.epam.arraysofarrays;
// task 15

public class LargestMatrixElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 2, 3, -1, 2, -6, 5, 3, 2, 1},
                {4, 1, -6, -2, 1, 4, -2, 3, -6, 5},
                {-6, 1, -6, 3, 7, 8, 4, 2, 0, 9}
        };
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if ( matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] < 0){
                    matrix[i][j] = max;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}