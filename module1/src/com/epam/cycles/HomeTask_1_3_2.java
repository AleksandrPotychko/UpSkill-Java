package com.epam.cycles;

public class HomeTask_1_3_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int h = 1;
        int y ;
        for(int x = a; x <=  b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -1 * x;
            }

            System.out.println(y);
        }
    }
}
