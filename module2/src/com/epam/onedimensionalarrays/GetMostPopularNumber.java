package com.epam.onedimensionalarrays;

public class GetMostPopularNumber {
    public static int getMostPopularNumber(int[] array) {
        int[] popular = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }
        int mostPopularNumber = array[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                mostPopularNumber = array[i];
            }
            if ((popResult == popular[i]) && (array[i] < mostPopularNumber)) {
                mostPopularNumber = array[i];
            }
        }
        return mostPopularNumber;
    }
}