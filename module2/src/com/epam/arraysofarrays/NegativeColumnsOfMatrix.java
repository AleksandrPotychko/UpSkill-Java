package com.epam.arraysofarrays;
// task 1

public class NegativeColumnsOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 2, 3, 1, 2, 6, 5, 3, 2, 1},
                {4, 1, 6, 2, 1, 4, 2, 3, 6, 5},
                {6, 1, 6, 3, 7, 8, 4, 2, 0, 9}
        };
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i += 2) {
                if (matrix[0][i] > matrix[2][i]) {
                    System.out.print(matrix[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }
}