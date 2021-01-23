package com.epam.arraysofarrays;

public class MatrixWorkerOrderN {
    //task 4
    public static  int[][] createSquareMatrixOrderPositiveN (int positiveN) {
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
        return matrix;
    }
    // task 5
    public static int[][] createMatrixForTaskFive(int orderN) {
        int [][] matrix = new int[orderN][orderN];
        for( int i = 0; i < orderN; i++) {
            for( int j = 0; j < orderN; j++) {
                if ( i + j < orderN) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    // task 6
    public static int[][] createMatrixForTaskSix(int orderN) {
        int [][] matrix = new int[orderN][orderN];
        for( int i = 0; i < orderN / 2; i++) {
            for( int j = 0; j < orderN; j++) {
                if(((i > j) || (i >= orderN - j ))) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        for(int i = (orderN / 2); i < orderN; i++) {
            for( int j = 0; j < orderN; j++) {
                if(matrix[orderN - i - 1][j] == 1 ) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    //task 7
    public static int createSquareMatrixAndCalculatePositiveElements(int orderN) {
        int positiveElements = 0;
        double[][] matrix = new double[orderN][orderN];
        for (int i = 0; i < orderN; i++) {
            for (int j = 0; j < orderN; j++) {
                matrix[i][j] = Math.sin( (Math.pow(i, 2) - Math.pow(j, 2) ) / orderN);
                if ( matrix[i][j] >= 0 ) {
                    positiveElements++;
                }
            }
        }
        return positiveElements;
    }
}