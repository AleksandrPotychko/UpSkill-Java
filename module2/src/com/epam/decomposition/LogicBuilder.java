package com.epam.decomposition;

import com.epam.sorting.ArraySorter;

public class LogicBuilder {

    //task 1
    public static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
        return ((firstNumber * secondNumber) / (SupportingLogicalBuilder.
                findGreatestCommonDivisor(firstNumber, secondNumber)));
    }

    //task 2
    public static int findLeastCommonMultipleForFourNumbers(int firstNumber, int secondNumber,
                                                             int thirdNumber, int fourthNumber) {
        return SupportingLogicalBuilder.findGreatestCommonDivisor((SupportingLogicalBuilder.
                findGreatestCommonDivisor(firstNumber, secondNumber)),
                (SupportingLogicalBuilder.findGreatestCommonDivisor(thirdNumber, fourthNumber)));
    }

    //task 3
    public static double findHexagonArea(double sizeHexagon, double amountOfCorners) {
        return SupportingLogicalBuilder.calculateEquilateralTriangleArea(sizeHexagon) * amountOfCorners;
    }

    //task 4
    public static double findGreatestDistance(double[] array) {
        double maxDistance = 0;
        for (double i = 0; i < array.length; i++) {
            for (double j = 1; j < array.length - j; j++) {
                if ((SupportingLogicalBuilder.
                        calculatePointSpacing(i ,i ,i + j,i + j)) > maxDistance) { maxDistance =
                        (SupportingLogicalBuilder.
                            calculatePointSpacing(i, i,  i + j, i + j));
                }
            }
        }
        return maxDistance;
    }

    //task 5
    public static int findSecondLargestNumber(int[] array,int indexNumber) {
        ArraySorter.applySelectionSort(array);
        return array[array.length  - indexNumber];
    }

    //task 6
    public static boolean checkThreeNumbersMutuallyPrime(int firstNumber, int secondNumber, int thirdNumber) {
        if ( SupportingLogicalBuilder.findGreatestCommonDivisor(SupportingLogicalBuilder.
                findGreatestCommonDivisor(firstNumber,secondNumber), thirdNumber) == 1) {
            return true;
        } else {
            return false;
        }
    }

    //task 7
    public static int calculateSumFactorialsOddNumbers(int minBorder, int maxBorder) {
        int sumFactorials = 0;
        for (int i = minBorder; i <= maxBorder; i += 2) {
            sumFactorials += SupportingLogicalBuilder.calculateFactorialNumber(i);
        }
        return sumFactorials;
    }

    //task 8
    public static int calculateSumThreeConsecutiveElementsOfArray(int[] array, int firstIndex, int lastIndex) {
        int sumElements = 0;
        for(int i = firstIndex; i <= lastIndex; i++) {
            sumElements += array[i];
        }
        return sumElements;
    }

    //task 9
    public static double findAreaRectangles(double firstSize, double secondSize, double thirdSize, double fourthSize) {
        double areaFirstTriangle = SupportingLogicalBuilder.findAreaRightTriangle(firstSize, secondSize);
        double diagonalRightTriangle = SupportingLogicalBuilder.findDiagonalRightTriangle(firstSize, secondSize);
        double areaSecondTriangle = SupportingLogicalBuilder.useHeronFormula(thirdSize, fourthSize, diagonalRightTriangle);
        return  areaFirstTriangle + areaSecondTriangle;
    }

    //task 10
    public static int[] calculateArrayFormationFromNumber(int number) {
        int[] array = new int[SupportingLogicalBuilder.findNumberLength(number)];
        int index = SupportingLogicalBuilder.findNumberLength(number) - 1;
        while (number > 0) {
            array[index--] = number % 10;
            number /= 10;
        }
        return array;
    }
}