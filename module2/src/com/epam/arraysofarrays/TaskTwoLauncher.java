package com.epam.arraysofarrays;

public class TaskTwoLauncher {
    public static void main(String[] args) {
        int [][] matrix = {
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 1},
                {0, 1, 2, 3, 1},
                {0, 1, 2, 3, 1},
                {0, 1, 2, 3, 4}
        };
        System.out.println(ColumnWithLargestSum.calculateColumnWithLargestSum(matrix));
        System.out.println(SquareMatrixOrderN.calculateSquareMatrixOrderN(8));
        SquareMatrixOrderPositiveN.createSquareMatrixOrderPositiveN(6);
    }
}