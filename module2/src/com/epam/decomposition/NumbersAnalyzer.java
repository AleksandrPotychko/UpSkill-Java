package com.epam.decomposition;


public class NumbersAnalyzer {
    //task 1
    public static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
        return ((firstNumber * secondNumber) / findGreatestCommonDivisor(firstNumber, secondNumber));
    }

    private static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }

    private static int findGreatestCommonDivisor(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return findGreatestCommonDivisor((findGreatestCommonDivisor(firstNumber, secondNumber)),
                (findGreatestCommonDivisor(thirdNumber, fourthNumber)));
        }

    //task 2
    public static int findLeastCommonMultiple(int firstNumber, int secondNumber,
                                                            int thirdNumber, int fourthNumber) {
        return findGreatestCommonDivisor(firstNumber,secondNumber,thirdNumber,fourthNumber);
    }

    //task 5
    public static int findSecondLargestNumber(int[] array,int indexNumber) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
        return array[array.length  - indexNumber];
    }

    //task 6
    public static boolean checkThreeNumbersMutuallyPrime(int firstNumber, int secondNumber, int thirdNumber) {
        if (findGreatestCommonDivisor(findGreatestCommonDivisor(firstNumber,secondNumber), thirdNumber) == 1) {
            return true;
        } else {
            return false;
        }
    }

    //task 7
    public static int calculateSumFactorialsOddNumbers(int minBorder, int maxBorder) {
        int sumFactorials = 0;
        for (int i = minBorder; i <= maxBorder; i += 2) {
            sumFactorials += calculateFactorialNumber(i);
        }
        return sumFactorials;
    }

    private static double calculateFactorialNumber(double number) {
        for(double i = number-1; i > 1; i--) {
            number *= i;
        }
        return number;
    }

    //task 8
    public static int calculateSumThreeConsecutiveElementsOfArray(int[] array, int firstIndex, int lastIndex) {
        int sumElements = 0;
        for(int i = firstIndex; i <= lastIndex; i++) {
            sumElements += array[i];
        }
        return sumElements;
    }

    //task 10
    public static int[] calculateArrayFormationFromNumber(int number) {
        int[] array = new int[findNumberLength(number)];
        int index = array.length - 1;
        while (number > 0) {
            array[index--] = number % 10;
            number /= 10;
        }
        return array;
    }

    private static int findNumberLength(int number) {
        int numberLength = 0;
        while (number > 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }
}