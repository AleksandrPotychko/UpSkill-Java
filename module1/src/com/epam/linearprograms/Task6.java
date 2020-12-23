package com.epam.linearprograms;

public class Task6 {
    public static void main(String[] args) {
        int x = 4;
        int y = -4;
        if (y <= -3 && y <= 0 && x <= -4  && x <= 4) {
            System.out.println("true");
        } else if (y < 0 && y <= 4 && x <= -2 && x <= 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}