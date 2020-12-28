package com.epam.onedimensionalarrays;
//Даны целые числа а1 ,а2 ,..., аn .
//Вывести на печать только те числа, для которых аi > i.

public class NumbersGreaterTheirIndex {
    public void numbersGreaterTheirIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("This number = " + array[i] + " greater than its index = " + i);
            }
        }
    }
}