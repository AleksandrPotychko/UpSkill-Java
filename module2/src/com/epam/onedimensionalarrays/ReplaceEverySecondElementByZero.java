package com.epam.onedimensionalarrays;

public class ReplaceEverySecondElementByZero {
    public static int[] replaceEverySecondElementByZero(int[] array){
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        return array;
    }
}