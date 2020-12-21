package com.epam.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task36 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the m:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringM = reader.readLine();
        int m = Integer.parseInt(stringM);
        System.out.println("Enter the n:");
        String stringN = reader.readLine();
        int n = Integer.parseInt(stringN);
        if (m <= 0 || n <= 0) {
            System.out.println("Введите натуральные числа.");
        } else if ( m > n) {
            System.out.println("Нарушена последовательность.");
        } for (int i = m; i <= n; i++) {
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j ) {
                    System.out.println("Делители для числа " + i + ": " + j);
                }
            }
        }
    }
}
