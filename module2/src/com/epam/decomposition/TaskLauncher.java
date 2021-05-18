package com.epam.decomposition;

import java.util.Arrays;

public class TaskLauncher {
    private static final int LENGTH_ARRAY = 20;
    private static final int MIN_BORDER = 1;
    private static final int MAX_BORDER = 9;
    private static final int FIRST_NUMBER = 10;
    private static final int LAST_NUMBER = FIRST_NUMBER * 2;
    private static final int SECOND_NUMBER = 18;
    private static final int THIRD_NUMBER = 25;
    private static final int FOURTH_NUMBER = 30;
    private static final double SIZE_HEXAGON = 10.0;
    private static final double[][] COORDINATES_OF_POINTS = {{7, 3, 1, 3, 8, 10, 11}, {10, 15, 17, 4, 3, 15, 18}};
    private static final int[] ARRAY = {12, 44, 12, 54, 68, 37,};
    private static final double FIRST_SIZE_RECTANGLES = 15;
    private static final double SECOND_SIZE_RECTANGLES = 15;
    private static final double THIRD_SIZE_RECTANGLES = 17;
    private static final double FOURTH_SIZE_RECTANGLES = 19;
    private static final int LARGE_NUMBER = 14213;


    public static void main(String[] args) {
        //task 1
        System.out.println(NumbersAnalyzer.findLeastCommonMultiple(FIRST_NUMBER, SECOND_NUMBER));

        //task 2
        System.out.println(NumbersAnalyzer.
                findLeastCommonMultiple(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER));

        //task 3
        System.out.println(GeometricalCalculator.findHexagonArea(SIZE_HEXAGON));

        //task 4
        System.out.println(Arrays.deepToString(GeometricalCalculator.findGreatestDistance(COORDINATES_OF_POINTS)));

        //task 5
        System.out.println(NumbersAnalyzer.findSecondLargestNumber(ArrayInitializer.buildArray(LENGTH_ARRAY,
                MIN_BORDER, LARGE_NUMBER)));

        //task 6
        System.out.println(NumbersAnalyzer.checkThreeNumbersMutuallyPrime(FIRST_NUMBER,SECOND_NUMBER,THIRD_NUMBER));

        //task 7
        System.out.println(NumbersAnalyzer.calculateSumFactorialsOddNumbers(MIN_BORDER, MAX_BORDER));

        //task 8
        System.out.println(NumbersAnalyzer.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),1, 3));

        System.out.println(NumbersAnalyzer.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),3, 5));

        System.out.println(NumbersAnalyzer.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),4, 6));

        //task 9
        System.out.println(GeometricalCalculator.findAreaRectangles(FIRST_SIZE_RECTANGLES,
                SECOND_SIZE_RECTANGLES, THIRD_SIZE_RECTANGLES, FOURTH_SIZE_RECTANGLES));

        //task 10
        System.out.println(Arrays.toString(NumbersAnalyzer.calculateArrayFormationFromNumber(LARGE_NUMBER)));

        //task 11
        System.out.println(NumbersAnalyzer.calculateWhichNumberIsLonger(FIRST_NUMBER, LARGE_NUMBER));

        //task 12


        //task 13
        NumbersAnalyzer.findTwinPrimeNumbers(FIRST_NUMBER, LAST_NUMBER);

        //task 14
        System.out.println(Arrays.toString(NumbersAnalyzer.findAllArmstrongNumbersBorders(LARGE_NUMBER, LENGTH_ARRAY)));

        //task 15
        NumbersAnalyzer.findNumbersAscendingSuccession(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, LARGE_NUMBER));

        //task 16
       // System.out.println(Arrays.toString(NumbersAnalyzer.findSumOddNumberAndEvenDigits(ARRAY)));

        //task 17
        System.out.println(NumbersAnalyzer.calculateNumberOfSubtractions(LARGE_NUMBER));

    }
}