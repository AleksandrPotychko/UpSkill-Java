package com.epam.dragon.starter;

import com.epam.dragon.entity.Dragon;
import com.epam.dragon.logic.ConsoleMenuAction;
import com.epam.dragon.util.TreasureInitializer;

public class TaskLauncher {
    private static final int QUANTITY_OF_TREASURES = 100;

    public static void main(String[] args) {
        Dragon ragnaros = new Dragon("Ragnaros", TreasureInitializer.
                createRandomTreasures(QUANTITY_OF_TREASURES));
        ConsoleMenuAction consoleMenu = new ConsoleMenuAction();
        consoleMenu.printMenuActions(ragnaros);
    }
}
