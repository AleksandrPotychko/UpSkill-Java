package com.epam.logic;

import com.epam.entity.Train;

import java.util.Comparator;
import java.util.Scanner;

public class TrainWorker {

    private static int counter = 0;

    public static void getTrainByNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train number: ");
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].isTrainNumb(inputNumber, trains[i])) {
                System.out.println(trains[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no train with this number.");
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

    public static void sortTrainDestinationName(Train [] trains) {
        Train swap;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].getDestinationName().compareTo(trains[j].getDestinationName());
                if (compare > 0) {
                    swap = trains[i];
                    trains[i] = trains[j];
                    trains[j] = swap;
                } else if (compare == 0) {
                    if (trains[i].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0) {
                        swap = trains[i];
                        trains[i] = trains[j];
                        trains[j] = swap;
                    }
                }
            }
        }
    }
}
