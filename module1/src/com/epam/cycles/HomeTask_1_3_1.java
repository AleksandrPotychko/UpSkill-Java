package com.epam.cycles;

public class HomeTask_1_3_1 {
    public static void main(String[] args) {
        int i = 1;
        int numb = 32;
        int sum = 0;
        while (i <= numb){
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел равна " + sum);
    }
}
