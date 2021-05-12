package com.epam.aggregation.starter;

import com.epam.aggregation.entity.*;
import com.epam.aggregation.logic.BankWorker;
import com.epam.aggregation.logic.CarWorker;
import com.epam.aggregation.logic.StateAggregator;
import com.epam.aggregation.logic.TextAggregator;

public class TaskLauncher {

    public static void main(String[] args) {

        // Task 1
        Word word = new Word("Heading");
        Word word2 = new Word("new Heading");
        Sentence sentence = new Sentence("Body text");
        Sentence sentence2 = new Sentence("Body text 2");
        Sentence sentence3 = new Sentence("Body text 3");
        Sentence sentence4 = new Sentence("Body text 4");
        Text text = new Text(word, TextAggregator.createSentences(sentence,sentence2,sentence3));
        TextAggregator.printText(text);
        text.addSentence(sentence4);
        TextAggregator.printText(text);

        // Task 2
        Engine engine = new Engine(500);
        Wheel wheel = new Wheel(18);
        Wheel spareWheel = new Wheel(17);
        Car reno = new Car(engine,"RENO", 98, wheel, wheel, wheel, wheel);
        System.out.println(reno);
        CarWorker.changeWheel(reno,3,spareWheel);
        System.out.println(reno);
        CarWorker.refuelTheCar(reno);
        System.out.println(reno);
        for (int i = 0; i < 10; i++) {
            CarWorker.rideByCar(reno);
        }
        System.out.println(reno);

        // Task 3
        City capital = new City("Minsk");
        int stateArea = 20000;
        State belarus = new State("Belarus", StateAggregator.createRegions(),capital,stateArea);
        System.out.println(belarus);
        StateAggregator.printCapital(belarus);
        StateAggregator.printNumberOfRegions(belarus);
        StateAggregator.printStateArea(belarus);
        StateAggregator.printRegionalCenter(belarus);

        // Task 4
        Bank belgaz = new Bank("Belgazprom", BankWorker.createClients());
        Client gwen = new Client("Gwen",BankWorker.createAccounts());
        System.out.println(gwen);
        System.out.println(BankWorker.calculateSumAccountsOfClient(gwen));
        System.out.println(BankWorker.calculatePositiveSumAccountsOfClient(gwen));
        System.out.println(BankWorker.calculateNegativeSumAccountsOfClient(gwen));
        System.out.println(belgaz);
        System.out.println(BankWorker.findAccountById(belgaz,7));

    }
}
