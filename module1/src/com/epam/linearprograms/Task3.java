package com.epam.linearprograms;

public class Task3 {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 2.0;
        if (Math.cos(x)-Math.sin(y)!=0){
            System.out.print("Value of formula = " + ((Math.sin(x) + Math.cos(y) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y)));
        }
        else {
            System.out.println("Division by 0");
        }
    }
}