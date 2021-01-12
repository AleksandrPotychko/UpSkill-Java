package com.epam.arraysofarrays;
//task 7

public class SquareMatrixOrderN {
    public static int calculateSquareMatrixOrderN(int orderN) {
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