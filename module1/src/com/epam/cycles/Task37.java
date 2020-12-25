package com.epam.cycles;

import java.util.Scanner;

public class Task37 {
    private static final int NUMBER_OF_DIGITS = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the а: ");
        int a = in.nextInt();
        System.out.println("Enter the b: ");
        int b = in.nextInt();
        int [] arr = new int[NUMBER_OF_DIGITS];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            int digitOfB = b % 10;
            if (arr[digitOfB] != 0)
                System.out.print(digitOfB + " ");
            b /= 10;
        }
    }
}

