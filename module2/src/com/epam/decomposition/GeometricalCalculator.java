package com.epam.decomposition;

public class GeometricalCalculator {
    //task 3
    public static double findHexagonArea(double sizeHexagon) {
        return calculateEquilateralTriangleArea(sizeHexagon) * 6;
    }

    private static double calculateEquilateralTriangleArea(double sizeTriangle) {
        return ((sizeTriangle * sizeTriangle * Math.sqrt(3)) / 4);
    }

    //task 4
    public static double findGreatestDistance(double[] array) {
        double maxDistance = 0;
        for (double i = 0; i < array.length; i++) {
            for (double j = 1; j < array.length - j; j++) {
                double distance = (calculatePointSpacing(i, i, i + j, i + j));
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    private static double calculatePointSpacing(double firstPointX, double firstPointY, double secondPointX,
                                                double secondPointY) {
        return Math.sqrt(Math.pow((secondPointX - firstPointX), 2) + Math.pow((secondPointY - firstPointY), 2));
    }

    //task 9
    public static double findAreaRectangles(double firstSize, double secondSize, double thirdSize, double fourthSize) {
        double areaFirstTriangle =findAreaRightTriangle(firstSize, secondSize);
        double diagonalRightTriangle =findDiagonalRightTriangle(firstSize, secondSize);
        double areaSecondTriangle =useHeronFormula(thirdSize, fourthSize, diagonalRightTriangle);
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
