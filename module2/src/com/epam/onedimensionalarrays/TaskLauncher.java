package com.epam.onedimensionalarrays;

import java.util.Arrays;

public class TaskLauncher {
    public static void main(String[] args) {
        double[] generatedNumbers = {3.2, 5.8, 1.0, 3.5, 3.1, 9.2, 7.0, 0.9, 1.4, 5.3};
        int[] arrayNaturalNumbers = {7, 3, 2, 9, 4, 8, 4, 0};
        System.out.println(SumCalculatorOfNumbersDivisibleByK.countSum(arrayNaturalNumbers, 2));
        System.out.println(CalculatorOfNumberOfReplacements.replaceElementsAndCountReplacements(arrayNaturalNumbers, 5));
        String arrayCharacteristic = Arrays.toString(RealNumbersArrayAnalyser.characterizeArray(arrayNaturalNumbers));
        System.out.println(arrayCharacteristic);
        NumbersGreaterTheirIndex number = new NumbersGreaterTheirIndex();
        number.numbersGreaterTheirIndex(arrayNaturalNumbers);
        System.out.println(SumCalculatorOfSequenceElementsWithPrimeIndexes.countSum(generatedNumbers));
        System.out.println(CalculateNumbersOfFormula.calculateNumbersOfFormula(arrayNaturalNumbers));
        System.out.println(Arrays.toString(ArrayWithoutMinValue.findAndDeleteMinValue(arrayNaturalNumbers)));
        System.out.println(IntArrayMinOfMostFrequentElementsFinder.findMostPopularNumber(arrayNaturalNumbers));
        System.out.println(Arrays.toString(EverySecondElementEqualsZero.buildNewArray(generatedNumbers)));
}
}