package com.epam.arraysofarrays;


public class MatrixTaskEleven {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) count += 1;
            }
            if (count >= 3) {
                int k = i + 1;
                System.out.println("A row with more than three 5 : " + k);
            }
        }
    }
}