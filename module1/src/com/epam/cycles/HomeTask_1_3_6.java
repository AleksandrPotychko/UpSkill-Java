package com.epam.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask_1_3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m;
        int n;
        System.out.println("Введите m:");
        String s1 = reader.readLine();
        m = Integer.parseInt(s1);
        System.out.println("Введите n:");
        String s2 = reader.readLine();
        n = Integer.parseInt(s2);
        if (m <= 0 || n <= 0) {
            System.out.println("Введите натуральные числа.");
        }
            else if ( m > n) {
            System.out.println("Нарушена последовательность.");

        }
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < n; j++) {

                if (i % j == 0 && i != j ) {
                    System.out.println("Делители для числа " + i + ": " + j);
                }


            }
        }

    }
}
