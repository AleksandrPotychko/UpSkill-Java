package com.epam.arraysofarrays;
//task 12

public class SortMatrixRows {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 4, 2, 1, 4},
                {3, 1, 4, 0, 4},
                {0, 1, 2, 3, 4},
                {2, 1, 4, 3, 0},
                {3, 2, 4, 3, 0}
        };
        int size = 5;
        for(int k = 0; k < size; k++) {
            for(int i = 0; i < (size - 1); i++) {
                for(int j = 0; j < size - i - 1; j++) {
                  //  if(matrix[k][j] < matrix[k][j+1])   for descending
                    if(matrix[k][j] > matrix[k][j+1]) {    // for ascending
                       int swapped = matrix[k][j];
                        matrix[k][j] = matrix[k][j+1];
                        matrix[k][j+1] = swapped;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}