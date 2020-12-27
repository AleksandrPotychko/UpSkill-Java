package com.epam.onedimensionalarrays;

public class TaskLauncher {
    public static void main(String[] args) {
        ArrayWorker worker = new ArrayWorker();
        int [] array= {1, 4, 3, 2, 5, 6, 7, 8, 6, 5, 4 ,3};
        worker.SumOfArrayElements(array, 2);
        System.out.println(worker.sumOfArrayElements);
    }
}