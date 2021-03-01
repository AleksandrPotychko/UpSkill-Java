package com.epam.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskLauncher {
    private static final int ROW = 3;
    private static final int COLUMN = 2;
    private static final int MATRIX_ORDER = 6;
    private static final int MIN_BORDER = 50;
    private static final int MAX_BORDER = 100;
    private static final int MINIMUM_NUMBER_OF_MATCHES = 3;
    private static final int SEARCH_NUMBER = 5;

    public static void main(String[] args) throws IOException {
       //task 1
        MatrixWorker.findOddColumnsWhereFirstElementGreaterThanLast(MatrixInitializer.
               buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER));

        //task 2
        MatrixWorker.findElementsTheMainDiagonal(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER));

        //task 3
        MatrixWorker.printRowAndColumn(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER), ROW, COLUMN);

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
               buildRandomSquareMatrix(MATRIX_ORDER, 0, MAX_BORDER), first, second);

        //task 9
        System.out.println(Arrays.toString(MatrixWorker.calculateColumnWithLargestSum(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, 0, MAX_BORDER))));

        //task 10
        System.out.println(Arrays.toString(MatrixWorker.calculatePositiveElementsOfMainDiagonal(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER))));
        //task 11
        System.out.println(Arrays.toString(MatrixWorker.buildMatrixOfTaskEleventh(MatrixInitializer.
                buildRandomMatrixForEleventhTask(10, 20), MINIMUM_NUMBER_OF_MATCHES, SEARCH_NUMBER)));

        //task 12
        MatrixSorter.sortRows(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER),true);

        //task 13
        MatrixSorter.sortColumns(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER), false);

        //task 14
        MatrixBuilder.buildMatrixAccordingToPattern4(ROW,COLUMN);

        //task 15
        MatrixSorter.replaceOddNumbersOnMaxElement(MatrixInitializer.
                buildRandomSquareMatrix(MATRIX_ORDER, MIN_BORDER, MAX_BORDER));

        //task 16
        MatrixBuilder.buildMagicSquare(ROW);
    }
}