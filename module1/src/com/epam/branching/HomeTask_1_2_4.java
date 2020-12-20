package com.epam.branching;

public class HomeTask_1_2_4 {
    public static void main(String[] args) {
         int a = 5;
         int b = 2;
         int x = 1;
         int y = 3;
         int z = 6;
         if ( a > x && b > y){
             System.out.println("Кирпич проходит в отверстие.");
         }
        else if ( a > y && b > x){
            System.out.println("Кирпич проходит в отверстие.");
        }
         else if ( a > y && b > z){
             System.out.println("Кирпич проходит в отверстие.");
         }
         else if ( a > z && b > y){
             System.out.println("Кирпич проходит в отверстие.");
         }
         else if ( a > x && b > z){
             System.out.println("Кирпич проходит в отверстие.");
         }
         else if ( a > z && b > x){
             System.out.println("Кирпич проходит в отверстие.");
         }
         else {
             System.out.println("Кирпич не пройдёт в отверстие.");
         }
    }
}
