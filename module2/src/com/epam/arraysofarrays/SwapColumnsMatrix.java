package com.epam.arraysofarrays;
// task 8

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SwapColumnsMatrix {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter first column: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringM = reader.readLine();
        int first = Integer.parseInt(stringM);

        System.out.println("Enter second column: ");
        String stringN = reader.readLine();
        int second = Integer.parseInt(stringN);
        int [][] matrix = {
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4}
        };
        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = x;
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}