package com.epam.arraysofarrays;

import java.io.IOException;
import java.util.Arrays;

public class TaskLauncher {
    private static final int ROW = 3;
    private static final int COLUMN = 2;
    private static final int MATRIX_ORDER = 6;
    public static void main(String[] args) throws IOException {
        //task 1
        System.out.println((MatrixWorker.findOddColumnsWhereFirstElementGreaterThanLast
                (MatrixInitializer.positiveSquareMatrix(MATRIX_ORDER))));

        //task 2
        System.out.println(MatrixWorker.findElementsTheMainDiagonal
                (MatrixInitializer.positiveSquareMatrix(MATRIX_ORDER)));

        //task 3
        System.out.println(MatrixWorker.outputGivenRowAndColumn
                (MatrixInitializer.positiveSquareMatrix(MATRIX_ORDER), ROW, COLUMN));

        //task 4
        System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createSquareMatrixOrderPositiveN(MATRIX_ORDER)));

       //task 5
        System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createMatrixForTaskFive(MATRIX_ORDER)));

        //task 6
        System.out.println(Arrays.deepToString(MatrixWorkerOrderN.createMatrixForTaskSix(MATRIX_ORDER)));

        //task 7
        System.out.println(MatrixWorkerOrderN.createSquareMatrixAndCalculatePositiveElements(MATRIX_ORDER));

        //task 8
        MatrixWorker.swapTwoAnyColumns(MatrixInitializer.positiveSquareMatrix(MATRIX_ORDER));

        //task 9
        System.out.println(MatrixWorker.calculateColumnWithLargestSum
                (MatrixInitializer.positiveSquareMatrix(MATRIX_ORDER)));

        //task 10
        MatrixWorker.calculatePositiveElementsOfMainDiagonal
               (MatrixInitializer.randomSquareMatrixWithPositiveAndNegativeElements(MATRIX_ORDER));

        //task 11
      // MatrixTaskEleven.matrixTaskEleven(MatrixInitializer.randomMatrix10x20(10,20));
    }
}