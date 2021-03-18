package com.epam.decomposition;

public class GeometricalCalculator {
    //task 3
    public static double findHexagonArea(double sizeHexagon) {
        final int NUMBER_OF_ANGLES = 6;
        return calculateEquilateralTriangleArea(sizeHexagon) * NUMBER_OF_ANGLES;
    }

    private static double calculateEquilateralTriangleArea(double sizeTriangle) {
        return ((sizeTriangle * sizeTriangle * Math.sqrt(3)) / 4);
    }

    //task 4
    public static double[][] findGreatestDistance(double[][] array) {
        double maxDistance = 0;
        double[][] pointsCoordinates = new double[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - j; j++) {
                double distance = calculatePointSpacing(array, i, i, i + j, i + j);
                if (distance > maxDistance) {
                    pointsCoordinates[0][0] = i;
                    pointsCoordinates[1][0] = i;
                    pointsCoordinates[0][1] = i + j;
                    pointsCoordinates[1][1] = i + j;
                    maxDistance = distance;
                }
            }
        }
        return pointsCoordinates;
    }

    private static double calculatePointSpacing(double[][] array, int firstX, int firstY, int secondX, int secondY) {
        return Math.sqrt(Math.
                pow((array[0][secondX] - array[0][firstX]), 2) + Math.pow((array[1][secondY] - array[1][firstY]), 2));
    }

    //task 9
    public static double findAreaRectangles(double firstSize, double secondSize, double thirdSize, double fourthSize) {
        double areaFirstTriangle = findAreaRightTriangle(firstSize, secondSize);
        double diagonalRightTriangle = findDiagonalRightTriangle(firstSize, secondSize);
        double areaSecondTriangle = useHeronFormula(thirdSize, fourthSize, diagonalRightTriangle);
        return  areaFirstTriangle + areaSecondTriangle;
    }
    private static double useHeronFormula(double firstCathetus, double secondCathetus, double hypotenuse) {
        double variable = (firstCathetus + secondCathetus + hypotenuse) / 2;
        return Math.sqrt(variable * (variable - firstCathetus) * (variable - secondCathetus) * (variable - hypotenuse));
    }

    private static double findDiagonalRightTriangle(double firstSize, double secondSize) {
        return Math.sqrt(firstSize * firstSize + secondSize * secondSize);
    }

    private static double findAreaRightTriangle(double firstSize, double secondSize) {
        return firstSize * secondSize / 2;
    }
}
