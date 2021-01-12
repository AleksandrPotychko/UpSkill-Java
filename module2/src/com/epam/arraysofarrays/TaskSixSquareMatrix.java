package com.epam.arraysofarrays;
//task 6

public class TaskSixSquareMatrix {
    public static void main(String[] args) {
        int positiveN = 6;
        int [][] matrix = new int[positiveN][positiveN];
        for( int i = 0; i < positiveN / 2; i++) {
            for( int j = 0; j < positiveN; j++) {
                if(((i > j) || (i >= positiveN - j ))) {
                 matrix[i][j] = 0;
            } else {
                matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i = (positiveN / 2); i < positiveN; i++) {
            for( int j = 0; j < positiveN; j++) {
                if(matrix[positiveN - i - 1][j] == 1 ) {
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