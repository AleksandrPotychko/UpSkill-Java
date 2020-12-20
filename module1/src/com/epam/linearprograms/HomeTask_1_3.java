package com.epam.linearprograms;

public class HomeTask_1_3 {
    public static void main(String[] args) {
        double x = 2.0;   //Значение в радинах
        double y = 2.0;   //Значение в радинах
        double z;
        if ( Math.cos(x)-Math.sin(y)==0){
            System.out.print("Делить на 0 нельзя!");
        }
        else {
            z = (Math.sin(x) + Math.cos(y) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
            System.out.println(z);
        }
    }
}
