package com.epam.decomposition;


import java.util.ArrayList;

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
    public static int findSecondLargestNumber(int[] array) {
        int max = array[0];
        int secondMax = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    secondMax = max;
                    max = array[i];
                } else if (array[i] > secondMax) {
                    secondMax = array[i];
                }
            }
            return secondMax;
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
    public static int  calculateWhichNumberIsLonger(int firstNumber, int secondNumber) {
        int lengthFirstNumber = findNumberLength(firstNumber);
        int lengthSecondNumber = findNumberLength(secondNumber);
        if (lengthFirstNumber > lengthSecondNumber) {
            return 1;
        } else  if (lengthFirstNumber < lengthSecondNumber) {
            return 2;
        } else {
            return -1;
        }
    }

    // task 12 mentor
    public static ArrayList<Integer> findNumbersEqualsToSumOfDigitsOfNumberKAndLessThanNumberN(int k, int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int minNumber = (int) (k % 9 * Math.pow(10.0, k / 9)) + (int) (Math.pow(10.0, k / 9)) - 1;
        if (k > 0 && n >= minNumber) {
            for (int i = n; i >= minNumber; i--) {
                int[] digits = splitNumberIntoDigits(i);
                int sum = 0;
                for (int digit : digits) {
                    sum += digit;
                }
                if (sum == k) {
                    numbers.add(i);
                }
            }
        }
        return numbers;
    }

    //task 13
    public static void findPairsOfSimpleTwins (int startingPoint) {
        for (int i = startingPoint; i <= startingPoint * 2; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }
    private static boolean isPrimeNumber (int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //task 13 mentor
    public static StringBuilder findTwinPrimeNumbers(int firstNumber, int lastNumber) {
        StringBuilder twinPrimes = new StringBuilder();
        final int specifiedFactor = 2;
        if (firstNumber > 2 && lastNumber == specifiedFactor * firstNumber) {
            ArrayList<Integer> primeNumbers = findPrimeNumbers(firstNumber, lastNumber);
            if (primeNumbers.size() != 0) {
                for (int i = 1; i < primeNumbers.size(); i++) {
                    if (primeNumbers.get(i - 1) + 2 == primeNumbers.get(i)) {
                        twinPrimes.append("[").append(primeNumbers.get(i - 1)).append(", ").append(primeNumbers.get(i)).
                                append("] ");
                    }
                }
            }
        }
        return twinPrimes;
    }
    private static ArrayList<Integer> findPrimeNumbers(int firstNumber, int lastNumber) {
        final int minDivisorForPrimeNumbers = 2;
        final int firstPrimeNumber = 2;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        if (firstNumber >= firstPrimeNumber && lastNumber > firstNumber) {
            for (int i = firstPrimeNumber; i <= lastNumber; i++) {
                boolean isCompositeNumber = false;
                for (int divisor = minDivisorForPrimeNumbers; divisor <= Math.round(Math.sqrt(i)); divisor++) {
                    if (i % divisor == 0) {
                        isCompositeNumber = true;
                        break;
                    }
                }
                if (!isCompositeNumber) {
                    primeNumbers.add(i);
                }
            }
        }
        return primeNumbers;
    }

    //task 14
    public static int[] findAllArmstrongNumbersBorders(int finishBorder, int arrayLangth) {
        int[] array = new int[arrayLangth];
        int count = 0;
        for (int i = 1; i <= finishBorder; i ++) {
            if (isAmstrongNumber(i)) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

    private static boolean isAmstrongNumber(int number) {
        int lengthNumber = findNumberLength(number);
        int[] array = calculateArrayFormationFromNumber(number);
        int sum = 0;
        for (int i = 0;  i < array.length; i ++) {
            sum += Math.pow(array[i], lengthNumber);
        }
       return number == sum;
    }

    //task 15
    public static void findNumbersAscendingSuccession(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumberForAscending(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean isNumberForAscending(int number) {
       int[] array = calculateArrayFormationFromNumber(number);
       for (int i = array.length - 1; i > 0; i--) {
           if (array[i] <= array[i - 1]) {
               return false;
           }
       }
       return true;
    }

    //task 16
    public static int[] findSumOddNumberAndEvenDigits(int orderN) {
        int[] array = arrayCreator(orderN);
        int[] resultArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            while (isNumberOddDigits(array[i])) {
                int sumNumber = calculateSumOddNumber(array[i]);
                int evenDigits = calculateNumberEvenDigits(sumNumber);
                resultArray[i] = sumNumber;
                resultArray[i + 1] = evenDigits;
            }
        }
            return resultArray;
    }

    private static int[] arrayCreator(int orderN) {
        int maxBorder = 899999999 / (int) Math.pow(10, (9 - orderN));
        int minBorder = 100000000 / (int) Math.pow(10, (9 - orderN));;
        int[] array = null;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxBorder) + minBorder);
        }
        return array;
    }

    private static int calculateSumOddNumber(int number) {
        int sumNumber = 0;
            int[] array = calculateArrayFormationFromNumber(number);
            for (int i = 0; i < array.length; i++) {
                sumNumber += array[i];
        }
        return sumNumber;
    }

    private static boolean isNumberOddDigits(int number) {
        int[] array = calculateArrayFormationFromNumber(number);
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int calculateNumberEvenDigits(int number) {
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
    public static int calculateNumberOfSubtractions(int number) {
        int count = 0;
        while (number != 0) {
            number -= calculateSumNumber(number);
            count++;
        }
        return count;
    }

    private static int calculateSumNumber(int number) {
        int sumNumber = 0;
        int[] array = calculateArrayFormationFromNumber(number);
        for (int i = 0; i < array.length; i++) {
            sumNumber += array[i];
        }
        return sumNumber;
    }
}