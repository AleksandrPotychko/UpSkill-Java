package com.epam.onedimensionalarrays;


public class NumbersGreaterTheirIndex {
    public void numbersGreaterTheirIndex(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                count++;
                System.out.println("This number = " + array[i] + " greater than its index = " + i);
            }
        }
        if (count == 0) {
            System.out.println("No  one number is greater than it's index");
        }
    }
}