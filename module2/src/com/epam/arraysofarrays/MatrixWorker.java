package com.epam.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixWorker {
    //task 1
    public static boolean findOddColumnsWhereFirstElementGreaterThanLast(int[][]matrix) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i += 2) {
                if (matrix[0][i] > matrix[4][i]) {
                    System.out.print(matrix[j][i] + "\t");
                }
            }
            System.out.println();
        }
        return true;
    }
    //task 2
    public static boolean findElementsTheMainDiagonal(int[][] matrix) {
        System.out.print("Elements standing on the diagonal = ");
        for( int i = 0; i < 5; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        return true;
    }
    //task 3
    public static boolean outputGivenRowAndColumn(int[][] matrix, int row, int column) {

        int rowNumber = row - 1;
        System.out.print("Row №" + row + " = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(matrix[rowNumber][i] + "\t");
        }
        System.out.println();
        int columnNumber = column - 1;
        System.out.println("Column №" + column + " :");
        for (int i = 0; i < 5; i++) {
            System.out.println(matrix[i][columnNumber]);
        }
        return true;
    }
    //task 8
    public static void swapTwoAnyColumns(int[][] matrix) throws IOException {
        System.out.println("Enter first column: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringM = reader.readLine();
        int first = Integer.parseInt(stringM);

        System.out.println("Enter second column: ");
        String stringN = reader.readLine();
        int second = Integer.parseInt(stringN);
        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = x;
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    //task 9
    public static int calculateColumnWithLargestSum(int[][] matrix ) {
        int largestSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumColumn = 0;
            for (int[] ints : matrix) {
                sumColumn = sumColumn + ints[i];
                if (sumColumn > largestSum) {
                    largestSum = sumColumn;
                }
            }
        }
        return largestSum;
    }
    //task 10
        public static boolean calculatePositiveElementsOfMainDiagonal(int[][] matrix) {
            System.out.print("Positive elements of main diagonal = ");
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] >= 0) {
                    System.out.print(matrix[i][i] + "\t");
                }
            }
            return true;
    }
}