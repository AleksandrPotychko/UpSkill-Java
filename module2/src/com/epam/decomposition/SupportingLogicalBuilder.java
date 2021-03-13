package com.epam.decomposition;

public class SupportingLogicalBuilder {

    // task 1 - 2
    public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }

    // task 3
    public static double calculateEquilateralTriangleArea(double sizeTriangle) {
        return ((sizeTriangle * sizeTriangle * Math.sqrt(3)) / 4);
    }

    // task 4
    public static double calculatePointSpacing(double firstPointX, double firstPointY, double secondPointX,
                                               double secondPointY) {
        return Math.sqrt(Math.pow((secondPointX - firstPointX), 2) + Math.pow((secondPointY - firstPointY), 2));
    }

    //task 7
    public static double calculateFactorialNumber(double number) {
        for(double i = number-1; i > 1; i--) {
            number *= i;
        }
        return number;
    }

    //task 9
    public static double useHeronFormula(double firstCathetus, double secondCathetus, double hypotenuse) {
        double variable = (firstCathetus + secondCathetus + hypotenuse) / 2;
        return Math.sqrt(variable * (variable - firstCathetus) * (variable - secondCathetus) * (variable - hypotenuse));
    }

    public static double findDiagonalRightTriangle(double firstSize, double secondSize) {
        return Math.sqrt(firstSize * firstSize + secondSize * secondSize);
    }

    public static double findAreaRightTriangle(double firstSize, double secondSize) {
        return firstSize * secondSize / 2;
    }

    //task 10
    public static int findNumberLength(int number) {
        int numberLength = 0;
        while (number > 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }
}