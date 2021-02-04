package com.epam.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskLauncher {
    private static final int ROW = 3;
    private static final int COLUMN = 2;
    private static final int MATRIX_ORDER = 6;

    public static void main(String[] args) throws IOException {
        //task 1
        MatrixWorker.findOddColumnsWhereFirstElementGreaterThanLast(MatrixInitializer.
                buildRandomSquareMatrixWithPositiveAndNegativeElements(MATRIX_ORDER));

        //task 2
        MatrixWorker.findElementsTheMainDiagonal(MatrixInitializer.
                buildRandomSquareMatrixWithPositiveAndNegativeElements(MATRIX_ORDER));

        //task 3
        MatrixWorker.printRowAndColumn(MatrixInitializer.
                buildRandomSquareMatrixWithPositiveAndNegativeElements(MATRIX_ORDER), ROW, COLUMN);

        //task 4
        System.out.println(Arrays.deepToString(MatrixBuilder.buildMatrixAccordingToPattern(MATRIX_ORDER)));

        //task 5
        System.out.println(Arrays.deepToString(MatrixBuilder.buildMatrixForTaskFive(MATRIX_ORDER)));

        //task 6
        System.out.println(Arrays.deepToString(MatrixBuilder.buildMatrixForTaskSix(MATRIX_ORDER)));

        //task 7
        System.out.println(MatrixBuilder.buildMatrixAndCalculatePositiveElements(MATRIX_ORDER));

        //task 8
        System.out.println("Enter first column: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringM = reader.readLine();
        int first = Integer.parseInt(stringM);

        System.out.println("Enter second column: ");
        String stringN = reader.readLine();
        int second = Integer.parseInt(stringN);
        MatrixWorker.swapTwoAnyColumns(MatrixInitializer.
               buildRandomSquareMatrixWithPositiveElements(MATRIX_ORDER), first, second);

        //task 9
        MatrixWorker.calculateColumnWithLargestSum(MatrixInitializer.
                buildRandomSquareMatrixWithPositiveElements(MATRIX_ORDER));

        //task 10
        System.out.println(Arrays.toString(MatrixWorker.calculatePositiveElementsOfMainDiagonal(MatrixInitializer.
                buildRandomSquareMatrixWithPositiveAndNegativeElements(MATRIX_ORDER))));

        //task 11
      // MatrixTaskEleven.matrixTaskEleven(MatrixInitializer.randomMatrix10x20(10,20));
    }
}