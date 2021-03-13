package com.epam.decomposition;

import com.epam.sorting.ArrayInitializer;

import java.util.Arrays;

public class TaskLauncher {
    private static final int LENGTH_ARRAY = 10;
    private static final int MIN_BORDER = 1;
    private static final int MAX_BORDER = 9;
    private static final int FIRST_NUMBER = 10;
    private static final int SECOND_NUMBER = 18;
    private static final int THIRD_NUMBER = 25;
    private static final int FOURTH_NUMBER = 30;
    private static final double AMOUNT_OF_CORNERS = 6.0;
    private static final double SIZE_HEXAGON = 10.0;
    private static final double[] COORDINATES_OF_POINTS = {5, 7, 2, 3, 15, 7, 12, 20};
    private static final int INDEX_NUMBER = 2;
    private static final double FIRST_SIZE_RECTANGLES = 15;
    private static final double SECOND_SIZE_RECTANGLES = 15;
    private static final double THIRD_SIZE_RECTANGLES = 17;
    private static final double FOURTH_SIZE_RECTANGLES = 19;
    private static final int LARGE_NUMBER = 14213;


    public static void main(String[] args) {
        //task 1
        System.out.println(LogicBuilder.findLeastCommonMultiple(FIRST_NUMBER, SECOND_NUMBER));

        //task 2
        System.out.println(LogicBuilder.
                findLeastCommonMultipleForFourNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER));

        //task 3
        System.out.println(LogicBuilder.findHexagonArea(SIZE_HEXAGON, AMOUNT_OF_CORNERS));

        //task 4
        System.out.println(LogicBuilder.findGreatestDistance(COORDINATES_OF_POINTS));

        //task 5
        System.out.println(LogicBuilder.findSecondLargestNumber(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER), INDEX_NUMBER));

        //task 6
        System.out.println(LogicBuilder.checkThreeNumbersMutuallyPrime(FIRST_NUMBER,SECOND_NUMBER,THIRD_NUMBER));

        //task 7
        System.out.println(LogicBuilder.calculateSumFactorialsOddNumbers(MIN_BORDER, MAX_BORDER));

        //task 8
        System.out.println(LogicBuilder.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),1, 3));

        System.out.println(LogicBuilder.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),3, 5));

        System.out.println(LogicBuilder.calculateSumThreeConsecutiveElementsOfArray(ArrayInitializer.
                buildArray(LENGTH_ARRAY, MIN_BORDER, MAX_BORDER),4, 6));

        //task 9
        System.out.println(LogicBuilder.
                findAreaRectangles(FIRST_SIZE_RECTANGLES,
                        SECOND_SIZE_RECTANGLES, THIRD_SIZE_RECTANGLES, FOURTH_SIZE_RECTANGLES));

        //task 10
        System.out.println(Arrays.toString(LogicBuilder.calculateArrayFormationFromNumber(LARGE_NUMBER)));
    }
}