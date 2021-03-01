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
    //task 7
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
    public static int[][] buildMatrixAccordingToPattern4(int numberOfRows, int numberOfColumns) {
        int[][] matrix = null;
        if (numberOfRows >= numberOfColumns && numberOfColumns > 1) {
            matrix = new int[numberOfRows][numberOfColumns];
            int randomRow;
            for (int j = 1; j < numberOfColumns; j++) {
                int counterOfOnes = j;
                while (counterOfOnes > 0) {
                    randomRow = (int) (Math.random() * numberOfRows);
                    if (matrix[randomRow][j] != 1) {
                        matrix[randomRow][j] = 1;
                        counterOfOnes--;
                    }
                }
            }
        }
        return matrix;
    }
    // task 16
    public static int[][] buildMagicSquare(int orderOfMatrix){
        int MIN_POSSIBLE_ORDER = 3;
        int[][] magicSquare = null;
        final boolean isOrderOfMatrixOddNumber = orderOfMatrix % 2 != 0;
        if (orderOfMatrix >= MIN_POSSIBLE_ORDER && isOrderOfMatrixOddNumber) {
            magicSquare = new int[orderOfMatrix][orderOfMatrix];
            final int maxValue = (int) Math.pow(orderOfMatrix, 2);
            final int lastIndex = orderOfMatrix - 1;
            int i = 0;
            int j = orderOfMatrix / 2; // the middle column
            int filler = 1; // the start value
            while (filler <= maxValue) {
                if (i < 0 && j <= lastIndex) {
                    i = lastIndex;
                } else if (i >= 0 && j > lastIndex) {
                    j = 0;
                } else if ( (i < 0 && j > lastIndex) || (magicSquare[i][j] != 0) ) {
                    i += 2;
                    j--;
                }
                magicSquare[i][j] = filler;
                filler++;
                i--;
                j++;
            }
        }
        return magicSquare;
    }
}