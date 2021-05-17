package com.epam.aggregationandcomposition.starter;

import com.epam.aggregationandcomposition.entity.*;
import com.epam.aggregationandcomposition.util.CarInitializer;
import com.epam.aggregationandcomposition.util.StateInitializer;
import com.epam.aggregationandcomposition.util.TextInitializer;

public class TaskLauncher {
    public static final int POWER_ENGINE = 500;
    public static final int DIAMETER_WHEEL = 18;
    public static int fuelInGasTank = 90;
    public static final int REPETITION_RATE = 7;
    public static final int NUMBER_OF_CHANGE_WHEEL = 3;
    public static final int NUMBER_OF_CAR_REFUELS = 15;
    public static String BRAND = "Reno";
    public static String CITY_NAME = "Minsk";
    public static String COUNTRY_NAME = "Minsk";
    public static String WORD = "Heading";
    public static final int STATE_AREA = 15000;
    public static final int ACCOUNT_ID = 5;

    public static void main(String[] args) {

        // Task 1
        Text text = new Text(TextInitializer.createWord(WORD), TextInitializer.createListSentence());
        text.printText();
        text.addSentence(TextInitializer.createSentence(TextInitializer.createListWords()));
        text.printText();

        // Task 2
        Car reno = new Car(CarInitializer.createEngine(POWER_ENGINE),BRAND, fuelInGasTank,
                CarInitializer.wheelsList(DIAMETER_WHEEL));
        reno.printCarBrand();
        reno.drive(REPETITION_RATE);
        reno.refuel(NUMBER_OF_CAR_REFUELS);
        reno.changeWheel(NUMBER_OF_CHANGE_WHEEL,CarInitializer.createWheel(DIAMETER_WHEEL));

        // Task 3
        State belarus = new State(COUNTRY_NAME, StateInitializer.
                createRegions(), StateInitializer.city(CITY_NAME),STATE_AREA);
        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printStateArea();
        belarus.printRegionalCenters();

//        // Task 4
//        Bank belgaz = new Bank("Belgazprom", BankWorker.createClients());
//        Client gwen = new Client("Gwen",BankWorker.createAccounts());
//        System.out.println(gwen);
//        System.out.println(BankWorker.calculateSumAccountsOfClient(gwen));
//        System.out.println(BankWorker.calculatePositiveSumAccountsOfClient(gwen));
//        System.out.println(BankWorker.calculateNegativeSumAccountsOfClient(gwen));
//        System.out.println(belgaz);
//        System.out.println(BankWorker.findAccountById(belgaz,ACCOUNT_ID));
    }
}
