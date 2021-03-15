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

    //task 11
    public static int  calculateWhichNumberIsLonger (int firstNumber, int secondNumber) {
        int lengthFirstNumber = findNumberLength(firstNumber);
        int lengthSecondNumber = findNumberLength(secondNumber);
        if (lengthFirstNumber > lengthSecondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    //task 13
    public static void findPairsOfSimpleTwins (int startingPoint) {
        for (int i = startingPoint; i <= startingPoint * 2; i++) {
            if (checkForPrimeNumber(i) && checkForPrimeNumber(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    private static boolean checkForPrimeNumber (int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //task 14
    public static int[] findAllArmstrongNumbersBorders (int finishBorder) {
        int[] array = new int[30];
        int count = 0;
        for (int i = 1; i <= finishBorder; i ++) {
            if (checkingForAmstrongNumber(i)) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

    private static boolean checkingForAmstrongNumber(int number) {
        int lengthNumber = findNumberLength(number);
        int[] array = calculateArrayFormationFromNumber(number);
        int sum = 0;
        for (int i = 0;  i < array.length; i ++) {
            sum += Math.pow(array[i], lengthNumber);
        }
        if (number != sum) {
            return false;
        }
        return true;
    }

    //task 15
    public static void findNumbersAscendingSuccession (int minBorder, int maxBorder, int arrayLength) {
        int[] array = arrayGenerating(minBorder,maxBorder,arrayLength);
        for (int i = 0; i < array.length; i++) {
            if (checkNumberForAscending(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean checkNumberForAscending (int number) {
       int[] array = calculateArrayFormationFromNumber(number);
       for (int i = array.length - 1; i > 0; i--) {
           if (array[i] <= array[i - 1]) {
               return false;
           }
       }
        return true;
    }

    private static int[] arrayGenerating (int minBorder, int maxBorder, int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxBorder) + minBorder);
        }
        return array;
    }

    //task 16
    public static int[] findSumOddNumberAndEvenDigits (int number) {
        int[] array = new int[2];
        while (checkNumberOddDigits(number)) {
            int sumNumber = calculateSumOddNumber(number);
            int evenDigits = calculateNumberEvenDigits(sumNumber);
            array[0] = sumNumber;
            array[1] = evenDigits;
        }
            return array;
    }

    private static int calculateSumOddNumber (int number) {
        int sumNumber = 0;
            int[] array = calculateArrayFormationFromNumber(number);
            for (int i = 0; i < array.length; i++) {
                sumNumber += array[i];
        }
        return sumNumber;
    }

    private static boolean checkNumberOddDigits (int number) {
        int[] array = calculateArrayFormationFromNumber(number);
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int calculateNumberEvenDigits (int number) {
        int countEvenDigits = 0;
        int[] array = calculateArrayFormationFromNumber(number);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }

    //task 17
    public static int numberOfSubtractions (int number) {
        int count = 0;
        int result = number;
        while (result != 0) {
            result = result - calculateSumNumber(result);
            count++;
        }
        return count;
    }

    private static int calculateSumNumber (int number) {
        int sumNumber = 0;
        int[] array = calculateArrayFormationFromNumber(number);
        for (int i = 0; i < array.length; i++) {
            sumNumber += array[i];
        }
        return sumNumber;
    }
}