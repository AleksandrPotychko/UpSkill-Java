package com.epam.cycles;

public class Task35 {
    private static final int  ASCII_LENGTH = 255;
    public static void main(String[] args) {
        for (int i = 0; i <= ASCII_LENGTH; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}