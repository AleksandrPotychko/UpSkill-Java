package com.epam.linearprograms;

public class HmeTask_1_2 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 5.0;
        double c = 2.0;
        double z;
        if ((b * b + 4 * a * c < 0) || a == 0 || b == 0){
            System.out.println("Ребята так нельзя!");
        }
        else {
            z = ((b + Math.sqrt(Math.pow(b, 2) +  4 * a * c))/(2 * a)) - Math.pow(a, 3) * c + 1/Math.pow(b, 2);
            System.out.println(z);
        }
    }
}
