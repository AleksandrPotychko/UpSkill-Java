package com.epam.logic;

import com.epam.entity.Train;


public class TrainWorker {


    public static Train getTrainByNumber(Train[] trains, int inputNumber) {
        Train train = null;
        for (int i = 0; i < trains.length; i++) {
            if (TrainWorker.isTrainNumb(inputNumber, trains[i])) {
                train = trains[i];
            }
        }
        return train;
    }

    public static boolean isTrainNumb(int inputTrainNumber, Train train) {
        return inputTrainNumber == train.getTrainNumber();
    }
}
