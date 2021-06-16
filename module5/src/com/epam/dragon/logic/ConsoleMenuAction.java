package com.epam.dragon.logic;

import com.epam.dragon.entity.Dragon;
import java.util.Scanner;

public class ConsoleMenuAction {
    private final Scanner scanner = new Scanner(System.in);

    public void printMenuActions(Dragon dragon) {
        String menuText = " Choose an option:\n" +
                "1 - Show all Treasures.\n" +
                "2 - Show most expensive.\n" +
                "3 - Show treasures to a set value.\n";
        System.out.println(menuText);
        processingActions(scanner.nextInt(), dragon);
    }

    private void processingActions(int choose, Dragon dragon) {
        TreasureAction treasureAction = new TreasureAction();
        switch (choose) {
            case 1:
                System.out.println("A list of all the treasures: \n");
                treasureAction.showAllTreasures(dragon);
                break;
            case 2:
                System.out.println("Most Expensive treasures: \n");
                System.out.println(treasureAction.chooseMostExpensive(dragon));
                break;
            case 3:
                int givenAmount;
                System.out.println("Enter the amount");
                Scanner scanner = new Scanner(System.in);
                givenAmount = scanner.nextInt();
                System.out.println("Treasures to the entered amount");
                System.out.println(treasureAction.findTreasureForGivenAmount(dragon, givenAmount));
                break;
            default:
                System.out.println("You entered an invalid value try again.");
                int newChoice;
                Scanner newScanner = new Scanner(System.in);
                newChoice = newScanner.nextInt();
                processingActions(newChoice, dragon);
                break;
        }
    }
}
