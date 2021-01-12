package com.epam.arraysofarrays;
// task 16

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquareOrderN {
    public static void main(String[] args) throws IOException {
        System.out.print("Give an odd number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringN = reader.readLine();
        int n = Integer.parseInt(stringN);
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int currRow;
        int currColumn;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            currRow = row;
            currColumn = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = currRow + 1;
                column = currColumn;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}