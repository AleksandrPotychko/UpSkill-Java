package com.epam.linearprograms;

public class HomeTask_1_5 {
    public static void main(String[] args) {
        int t = 7772;
        int hours = t / 3600;
        int minutes = t / 60 - hours * 60;
        int seconds = t - (minutes * 60 + hours * 3600);
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c. ");
    }
}
