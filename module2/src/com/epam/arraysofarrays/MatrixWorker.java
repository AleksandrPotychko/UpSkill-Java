package com.epam.arraysofarrays;

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
}