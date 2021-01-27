package com.epam.arraysofarrays;


public class MatrixWorker {
    //task 1
    public static void findOddColumnsWhereFirstElementGreaterThanLast(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i += 2) {
                if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                    System.out.print(matrix[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }
    //task 2
    public static void findElementsTheMainDiagonal(int[][] matrix) {
        System.out.print("Elements standing on the diagonal = ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
    }
    //task 3
    public static void printRowAndColumn(int[][] matrix, int row, int column) {
        int rowNumber = row - 1;
        System.out.print("Row №" + row + " = ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[rowNumber][i] + "\t");
        }
        System.out.println();
        int columnNumber = column - 1;
        System.out.println("Column №" + column + " :");
        for (int[] number : matrix) {
            System.out.println(number[columnNumber]);
        }
    }
    //task 8
    public static int[][] swapTwoAnyColumns(int[][] matrix, int first, int second){
        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = x;
        }
        return matrix;
    }
    //task 9 notFixed
    public static int calculateColumnWithLargestSum(int[][] matrix) {
        int largestSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumColumn = 0;
            for (int[] number : matrix) {
                sumColumn = sumColumn + number[i];
                if (sumColumn > largestSum) {
                    largestSum = sumColumn;
                }
            }
        }
        return largestSum;
    }
    //task 10
    public static int[] calculatePositiveElementsOfMainDiagonal(int[][] matrix) {
        System.out.print("Positive elements of main diagonal = ");
        int[] newMatrix = new int[matrix.length];
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] >= 0) {
                newMatrix[j] = matrix[i][i];
                j++;
            }
        }
        return newMatrix;
    }
}