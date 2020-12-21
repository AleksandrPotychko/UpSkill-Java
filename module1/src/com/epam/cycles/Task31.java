package com.epam.cycles;

public class Task31 {
    public static void main(String[] args) {
        long numb = 5;
        long sum = 0;
        for (long i = 1; i <= numb; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
