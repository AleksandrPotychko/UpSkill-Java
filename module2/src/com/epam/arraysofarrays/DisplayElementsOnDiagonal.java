package com.epam.arraysofarrays;
// task 2

public class DisplayElementsOnDiagonal {
    public static void main(String[] args) {
        int [][] matrix = {
                {5, 4, 1, 5, 6},
                {3, 1, 7, 5, 4},
                {1, 7, 9, 3, 2},
                {2, 5, 6, 7, 2},
                {1, 5, 6, 2, 9}
        };
        System.out.print("Elements standing on the diagonal = ");
        for( int i = 0; i < 5; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
    }
}