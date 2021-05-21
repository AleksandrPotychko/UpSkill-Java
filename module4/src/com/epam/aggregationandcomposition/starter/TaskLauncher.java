package com.epam.aggregationandcomposition.starter;

import com.epam.aggregationandcomposition.entity.*;
import com.epam.aggregationandcomposition.util.*;

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
    public static String NAME_BANK = "Belarusbank";
    public static String NAME_TRAVEL_AGENCY = "Serious Sam";
    public static final int STATE_AREA = 15000;
    public static final int ACCOUNT_ID = 5;
    public static final int DAYS = 21;

    public static void main(String[] args) {
        // Task 1
        Text text = new Text(new Word(WORD), TextInitializer.createListSentence());
        text.printText();
        text.addSentence(new Sentence(TextInitializer.createListWords()));
        text.printText();

        // Task 2
        Car reno = new Car(new Engine(POWER_ENGINE),BRAND, fuelInGasTank, CarInitializer.wheelsList(DIAMETER_WHEEL));
        reno.printCarBrand();
        reno.drive(REPETITION_RATE);
        reno.refuel(NUMBER_OF_CAR_REFUELS);
        reno.changeWheel(NUMBER_OF_CHANGE_WHEEL, new Wheel(DIAMETER_WHEEL));

        // Task 3
        State belarus = new State(COUNTRY_NAME, StateInitializer.createRegions(), new City(CITY_NAME),STATE_AREA);
        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printStateArea();
        belarus.printRegionalCenters();

        // Task 4
        Bank bank = new Bank(NAME_BANK, BankInitializer.createClients());
        System.out.println(bank.getClients().get(0).calculatePositiveSum());
        System.out.println(bank.getClients().get(1).calculateNegativeSum());
        System.out.println(bank.getClients().get(2).calculateBalanceAccounts());
        System.out.println(bank.calculatePositiveSumAccountsAllClients());
        System.out.println(bank.calculateNegativeSumAccountsAllClients());
        System.out.println(bank.calculateBalanceAccountsAllClients());
        System.out.println(bank.findAccountById(ACCOUNT_ID));
        bank.getClients().get(1).sortByBalance();
        System.out.println(bank.getClients().get(1).getAccounts());

        // Task 5
        TravelAgency travelAgency = new TravelAgency(NAME_TRAVEL_AGENCY, TripInitializer.createTrips());
        System.out.println(travelAgency.findTripsByFeeding(Feeding.ALL_INCLUSIVE));
        System.out.println(travelAgency.findTripsByType(TypeOfTrip.SANATORIUM));
        System.out.println(travelAgency.findTripsByTransport(Transport.SHIP));
        System.out.println(travelAgency.findTripsByTypeAndDays(TypeOfTrip.CRUISE, DAYS));
        travelAgency.sortByDays();
        System.out.println(travelAgency);
        travelAgency.sortByTransport();
        System.out.println(travelAgency);
        travelAgency.sortByFeeding();
        System.out.println(travelAgency);
        travelAgency.sortByTypeOfTrip();
        System.out.println(travelAgency);
    }
}
