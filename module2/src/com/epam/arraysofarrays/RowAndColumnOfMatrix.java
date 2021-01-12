package com.epam.arraysofarrays;
//task 3

public class RowAndColumnOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {5, 4, 1, 5, 6},
                {3, 1, 7, 5, 4},
                {1, 7, 9, 3, 2},
                {2, 5, 6, 7, 2},
                {1, 5, 6, 2, 9}
        };
        int row = 3;
        int rowNumber = row + 1;
        System.out.print("Row №" + rowNumber + " = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(matrix[row][i] + "\t");
        }
        System.out.println();
        int column = 2;
        int columnNumber = column + 1;
        System.out.println("Colum №" + columnNumber + " :");
        for (int i = 0; i < 5; i++) {
            System.out.println(matrix[i][column]);
        }
    }
}