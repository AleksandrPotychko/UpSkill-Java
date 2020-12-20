package com.epam.branching;

public class HomeTask_1_2_1 {
    public static void main(String[] args) {
        int a = 90;
        int b = 45;
        int c ;
        if ( ( a + b) < 180 ) {
            c = 180 - (a + b);
            System.out.println("Треугольник с такими углами существует.");

            if (a == 90 || b == 90 || c ==90){
                System.out.println("И он являеться прямоугольным");
            }
    }
        else {
            System.out.println("Треугольника с такими углами не существует.");
        }
    }
}