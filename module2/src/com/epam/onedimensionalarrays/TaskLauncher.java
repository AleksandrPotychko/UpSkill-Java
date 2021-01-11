package com.epam.onedimensionalarrays;

import java.util.Arrays;

public class TaskLauncher {
    public static void main(String[] args) {
        int [] arrayNaturalNumbers= {7, 3, 2, 9, 4, 8, 4, 0};
        System.out.println(SumCalculatorOfNumbersDivisibleByK.countSum(arrayNaturalNumbers, 2));

  System.out.println(CalculatorOfNumberOfReplacements.replaceElementsAndCountReplacements(arrayNaturalNumbers, 5));

 String arrayCharacteristic = Arrays.toString(RealNumbersArrayAnalyser.characterizeArray(arrayNaturalNumbers));
 System.out.println(arrayCharacteristic);

 NumbersGreaterTheirIndex number = new NumbersGreaterTheirIndex();
 number.numbersGreaterTheirIndex(arrayNaturalNumbers);

 System.out.println(SumOfIndexesOfPrimeNumbers.sumOfIndexesOfPrimeNumbers(arrayNaturalNumbers));

 System.out.println(CalculateNumbersOfFormula.calculateNumbersOfFormula(arrayNaturalNumbers));

 System.out.println(DeleteMinValueOfArray.deleteMinValue(arrayNaturalNumbers));

 System.out.println(GetMostPopularNumber.getMostPopularNumber(arrayNaturalNumbers));

    }
}