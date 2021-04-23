package com.epam.logic;

import com.epam.entity.Train;


public class TrainWorker {

    private static int counter = 0;
    private static Train yourTrain;

    public static Train getTrainByNumber(Train[] trains, int inputNumber) {
        for (int i = 0; i < trains.length; i++) {
            if (TrainWorker.isTrainNumb(inputNumber, trains[i])) {
                yourTrain = trains[i];
                counter++;
            }
        }
        if (counter == 0) {
            yourTrain = null;
        }
        return yourTrain;
    }

    public static boolean isTrainNumb(int inputTrainNumber, Train train) {
        return inputTrainNumber == train.getTrainNumber();
    }
}
