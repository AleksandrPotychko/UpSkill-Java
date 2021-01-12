package com.epam.arraysofarrays;
// task 4

public class SquareMatrixOrderPositiveN {
    public static  int createSquareMatrixOrderPositiveN (int positiveN) {
        int [][] matrix = new int[positiveN][positiveN];
        for( int i = 0; i < positiveN; i++) {
            for( int j = 0; j < positiveN; j++) {
                if (i % 2 ==0) {
                matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = positiveN - j;
                }
            }
        }
        return matrix[positiveN][positiveN];
    }
}