package com.epam.arraysofarrays;
// task 13

public class SortMatrixColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 4, 2, 1, 4},
                {3, 1, 4, 0, 3},
                {0, 1, 2, 3, 4},
                {2, 1, 4, 3, 1},
                {3, 2, 4, 3, 2}
        };
        int size = 5;
        for(int k = 0; k < size; k++) {
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size -i - 1; j++) {
                    //  if(matrix[k][j] < matrix[k + 1][j])   for descending
                    if(matrix[j][k] > matrix[j + 1][k]) {    // for ascending
                        int swapped = matrix[j][k];
                        matrix[j][k] = matrix[j + 1][k];
                        matrix[j + 1][k] = swapped;
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