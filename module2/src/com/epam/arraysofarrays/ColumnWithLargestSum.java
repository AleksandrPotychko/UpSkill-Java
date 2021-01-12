package com.epam.arraysofarrays;
// task 9

public class ColumnWithLargestSum {
    public static int calculateColumnWithLargestSum(int[][] matrix ) {
        int largestSum = 0;
        for (int i = 0; i < matrix.length; i++) {
              int sumColumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumColumn = sumColumn + matrix[j][i];
                if (sumColumn > largestSum) {
                    largestSum = sumColumn;
                }
            }
        }
        return largestSum;
    }
}