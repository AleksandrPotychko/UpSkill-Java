package com.epam.onedimensionalarrays;


public class EverySecondElementEqualsZero {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrayIndex =0;
        int arrayIndexAfterDeletingValue = 1;
        int countDeletingValue = array.length;
        while (arrayIndex < array.length){
            if ( arrayIndex % 2 != 0) {
                countDeletingValue --;
                for (int j = arrayIndexAfterDeletingValue; j < countDeletingValue; j++) {
                    array[j] = array[j + 1];
                }
                arrayIndexAfterDeletingValue ++;
                arrayIndex ++;
            } else {
                arrayIndex ++;
            }
        }
        for (int i = countDeletingValue; i < array.length; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}