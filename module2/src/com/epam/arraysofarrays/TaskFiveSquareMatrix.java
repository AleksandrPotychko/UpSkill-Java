package com.epam.arraysofarrays;
// task 5

public class TaskFiveSquareMatrix {
    public static void main(String[] args) {
        int positiveN = 6;
        int [][] matrix = new int[positiveN][positiveN];
        for( int i = 0; i < positiveN; i++) {
            for( int j = 0; j < positiveN; j++) {
                if ( i + j < positiveN) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}