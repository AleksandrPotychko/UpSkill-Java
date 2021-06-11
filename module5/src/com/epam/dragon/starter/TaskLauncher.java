package com.epam.dragon.starter;

import com.epam.dragon.entity.Dragon;
import com.epam.dragon.logic.ConsoleMenuAction;
import com.epam.dragon.util.TreasureAggregator;

public class TaskLauncher {
   public static Dragon dragon = new Dragon("Ragnaros", TreasureAggregator.createTreasures());

    public static void main(String[] args) {
        ConsoleMenuAction consoleMenu = new ConsoleMenuAction();
        consoleMenu.printMenuActions();
    }
}
