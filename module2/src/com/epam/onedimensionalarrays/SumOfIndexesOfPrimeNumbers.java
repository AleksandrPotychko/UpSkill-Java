package com.epam.onedimensionalarrays;
//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class SumOfIndexesOfPrimeNumbers {
    public static int sumOfIndexesOfPrimeNumbers(int[] array) {
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            int dividers = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    dividers++;
            }
            if (dividers <= 2)
                sum += array[i];
        }
        return  sum;
    }
 }
