package com.epam.branching;

public class HomeTask_1_2_3 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 8;
        int x3 = 3;
        int y3 = 3;
        if ((x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2)){
            System.out.println("Все точки находяться на одной прямой");

        }
        else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
