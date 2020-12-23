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
        for (int i = m; i <= n; i++) {
            for (int divisor = 2; divisor < n; divisor++) {
                boolean isNaturalNumber = false;
                System.out.print("\nThe number " + i + " = ");
                while (divisor <= i / 2) {
                    if (i % divisor == 0) {
                        System.out.print(divisor + " ");
                        isNaturalNumber = true;
                    }
                    divisor++;
                }
                if (!isNaturalNumber) {
                    System.out.print("Prime number");
                }
            }
        }
    }
}