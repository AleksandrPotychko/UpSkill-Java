package com.epam.arraysofarrays;

import java.util.Arrays;

public class TaskLauncher {
    private static final int ROW = 3;
    private static final int COLUMN = 2;
    private static final int MATRIX_ORDER = 6;
    public static void main(String[] args) {
        //task 1
       System.out.println((MatrixWorker.findOddColumnsWhereFirstElementGreaterThanLast
               (MatrixInitializer.positiveSquareMatrix)));

        //task 2
        System.out.println(MatrixWorker.findElementsTheMainDiagonal(MatrixInitializer.positiveSquareMatrix));

        //task 3
       System.out.println(MatrixWorker.outputGivenRowAndColumn(MatrixInitializer.positiveSquareMatrix, ROW, COLUMN));

        //task 4
       System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createSquareMatrixOrderPositiveN(MATRIX_ORDER)));

       //task 5
        System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createMatrixForTaskFive(MATRIX_ORDER)));

        //task 6
        System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createMatrixForTaskSix(MATRIX_ORDER)));

        //task 7
        System.out.println(MatrixWorkerOrderN.createSquareMatrixAndCalculatePositiveElements(MATRIX_ORDER));
    }
}