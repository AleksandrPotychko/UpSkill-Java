package com.epam.linearprograms;

public class HomeTask_1_6 {
    public static void main(String[] args) {
        int x = 4;
        int y = -4;
        if (-3 <= y && y <= 0 && -4 <= x && x <= 4){
            System.out.println("true");

        }
        else if (0 < y && y <= 4 && -2 <= x && x <= 2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
