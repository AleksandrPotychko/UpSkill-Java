package com.epam.branching;

public class Task24 {
    public static void main(String[] args) {
         double a = 7;
         double b = 2;
         double x = 1;
         double y = 3;
         double z = 6;
         if (a > x && b > y || a > y && b > x || a > y && b > z || a > z && b > y || a > x && b > z || a > z && b > x){
             System.out.println("Brick goes through the hole.");
         } else {
             System.out.println("Brick does not go through the hole.");
         }
    }
}
