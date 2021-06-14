package com.epam.dragon.logic;

import com.epam.dragon.entity.Dragon;
import com.epam.dragon.entity.Treasure;

import java.util.*;

public class TreasureAction {
    public void showAllTreasures(Dragon dragon) {
        for (Treasure treasure: dragon.getTreasures()) {
            System.out.println(treasure);
        }
    }
    private static int findHighPriseForTreasure(Dragon dragon) {
        return Collections.max(dragon.getTreasures());
    }

    public List<Treasure> chooseMostExpensive(Dragon dragon) {
        int highPrise = TreasureAction.findHighPriseForTreasure(dragon);
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure treasure: dragon.getTreasures()) {
            if (highPrise == treasure.getValue()) {
                treasures.add(treasure);
            }
        }
        return treasures;
    }

    public List<Treasure> findTreasureForGivenAmount(Dragon dragon, int givenAmount) {
        List<Treasure> treasures = new ArrayList<>();
        for (Treasure treasure: dragon.getTreasures()) {
            if (givenAmount >= treasure.getValue()) {
                treasures.add(treasure);
            }
        }
        return treasures;
    }
}
