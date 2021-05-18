package com.epam.logic;

import com.epam.entity.Train;

import java.util.Comparator;

public class TrainByDestinationNameComparator implements Comparator<Train> {
    public int compare(Train train1, Train train2) {
//        if (train1.getDestinationName().equals(train2.getDestinationName())) {
//            return train1.getDepartureTime().compareTo(train2.getDepartureTime());
//        } else {
//            return train1.getDestinationName().compareTo(train2.getDestinationName());
//        }
//    }
        final int comparisonByDestination = train1.getDestinationName().compareTo(train2.getDestinationName());
        return (comparisonByDestination != 0) ? comparisonByDestination : train1.getDepartureTime().compareTo(train2.
                getDepartureTime());
    }
}
