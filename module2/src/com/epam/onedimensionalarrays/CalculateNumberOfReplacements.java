package com.epam.onedimensionalarrays;
//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class CalculateNumberOfReplacements {
    public static int calculateNumberOfReplacements(int[] array, int replacement) {
        int numberOfReplacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > replacement) {
                array[i] = replacement;
                numberOfReplacements++;
            }
        }
        return numberOfReplacements;
    }
}