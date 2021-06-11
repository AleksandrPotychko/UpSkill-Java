package com.epam.dragon.logic;

import com.epam.dragon.entity.Treasure;
import com.epam.dragon.starter.TaskLauncher;

import java.util.ArrayList;
import java.util.List;

public class TreasureAction {
    public void showAllTreasures() {
        for (Treasure treasure: TaskLauncher.dragon.getTreasures()) {
            System.out.println(treasure);
        }
    }

    private static int findHighPriseForTreasure() {
        int highPrise = 0;
        for (Treasure treasure: TaskLauncher.dragon.getTreasures()) {
            if (treasure.getValue() > highPrise) {
                highPrise = treasure.getValue();
            }
        }
        return highPrise;
    }

    public List<Treasure> chooseMostExpensive() {
        int highPrise = TreasureAction.findHighPriseForTreasure();
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure treasure: TaskLauncher.dragon.getTreasures()) {
            if (highPrise == treasure.getValue()) {
                treasures.add(treasure);
            }
        }
        return treasures;
    }

    public List<Treasure> findTreasureForGivenAmount(int givenAmount) {
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure treasure: TaskLauncher.dragon.getTreasures()) {
            if (givenAmount >= treasure.getValue()) {
                treasures.add(treasure);
            }
        }
        return treasures;
    }
}
