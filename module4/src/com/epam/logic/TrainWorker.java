package com.epam.logic;

import com.epam.entity.Train;

import java.util.Scanner;

public class TrainWorker {
    public static void selectTrainNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train number: ");
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].isTrainNumb(inputNumber, trains[i])) {
                System.out.println(trains[i]);
            }
        }
    }

    public static Train[] sortTrainNumber(Train[] trains) {
        int count = 0;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 1 + count; j < trains.length; j++)
                if (trains[i].getTrainNumber() > trains[j].getTrainNumber()) {
                    Train swap = trains[i];
                    trains[i] = trains[j];
                    trains[j] = swap;
                }
            count++;
        }
        return trains;
    }
}
