package com.epam.arraysofarrays;
//task 10

public class PositiveElementsMainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 3, 4},
                {0, -1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, -4}
        };
        System.out.print("Positive elements of main diagonal = ");
        for (int i = 0; i < matrix.length; i++) {
                if(matrix[i][i] >= 0){
                    System.out.print(matrix[i][i] + "\t");
            }
        }
    }
}