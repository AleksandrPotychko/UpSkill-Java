package com.epam.arraysofarrays;

public class MatrixBuilder {
    //task 4
    public static  int[][] buildMatrixAccordingToPattern(int orderOfMatrix) {
        int[][] matrix = new int[orderOfMatrix][orderOfMatrix];
        for (int i = 0; i < orderOfMatrix; i++) {
            boolean isOddRow = i % 2 == 0;
            if (isOddRow) {
                for (int j = 0; j < orderOfMatrix; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < orderOfMatrix; j++) {
                    matrix[i][j] = orderOfMatrix - j;
                }
            }
        }
        return matrix;
    }
    // task 5
    public static int[][] buildMatrixForTaskFive(int orderOfMatrix) {
        int[][] matrix = new int[orderOfMatrix][orderOfMatrix];
        for (int i = 0; i < orderOfMatrix; i++) {
            for (int j = 0; j < orderOfMatrix; j++) {
                if (i + j < orderOfMatrix) {
                    matrix[i][j] = i + 1;
                }
            }
        }
        return matrix;
    }
    // task 6
    public static int[][] buildMatrixForTaskSix(int orderOfMatrix) {
        int[][] matrix = new int[orderOfMatrix][orderOfMatrix];
        final int rowBeforeMiddle = orderOfMatrix / 2 - 1;
        int numberOfZeros = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = numberOfZeros; j < (matrix[i].length - numberOfZeros); j++) {
                matrix[i][j] = 1;
            }
            if (i < rowBeforeMiddle) {
                numberOfZeros++;
            } else if (i > rowBeforeMiddle) {
                numberOfZeros--;
            }
        }
        return matrix;
    }
    //task 7 notFixed
    public static int buildMatrixAndCalculatePositiveElements(int orderOfMatrix) {
        int positiveElements = 0;
        double[][] matrix = new double[orderOfMatrix][orderOfMatrix];
        for (int i = 0; i < orderOfMatrix; i++) {
            for (int j = 0; j < orderOfMatrix; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / orderOfMatrix);
                if (matrix[i][j] > 0) {
                    positiveElements++;
                }
            }
        }
        return positiveElements;
    }
    //task 14
    public static void buildMatrixMxN(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if( i <= j )  {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // task 16
    public static void buildMagicSquare(int orderOfMatrix){
        int[][] magicSquare = new int[orderOfMatrix][orderOfMatrix];
        int number = 1;
        int row = 0;
        int column = orderOfMatrix / 2;
        int currRow;
        int currColumn;
        while (number <= orderOfMatrix * orderOfMatrix) {
            magicSquare[row][column] = number;
            number++;
            currRow = row;
            currColumn = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = orderOfMatrix - 1;
            }
            if (column == orderOfMatrix) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = currRow + 1;
                column = currColumn;
                if (row == -1) {
                    row = orderOfMatrix - 1;
                }
            }
        }
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}