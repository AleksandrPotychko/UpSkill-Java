package com.epam.aggregation.logic;

import com.epam.aggregation.entity.Account;
import com.epam.aggregation.entity.Bank;
import com.epam.aggregation.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class BankWorker {
    private static Account account;

    public static Account findAccountById(Bank bank, int accountId) {
        int countClients = bank.getClients().size();
        for (int i = 0; i < countClients; i++) {
            int countAccounts = bank.getClients().get(i).getAccounts().size();
            for (int j = 0; j < countAccounts; j++) {
                if ( accountId == bank.getClients().get(i).getAccounts().get(j).getId()) {
                    account = bank.getClients().get(i).getAccounts().get(j);
                }
            }
        }
        return account;
    }

    public static List<Account> createAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(10.17));
        accounts.add(new Account(9.00));
        accounts.add(new Account(-50.57));
        accounts.add(new Account(100.12));
        accounts.add(new Account(-77.24));
        accounts.add(new Account(52.33));
        return accounts;
    }

    public static List<Client> createClients() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Alex", BankWorker.createAccounts()));
        clients.add(new Client("Ben", BankWorker.createAccounts()));
        clients.add(new Client("Sheldon", BankWorker.createAccounts()));
        return clients;
    }

    public static double calculateSumAccountsOfClient(Client client) {
        int count = client.getAccounts().size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += client.getAccounts().get(i).getBalance();
        }
        return sum;
    }

    public static double calculatePositiveSumAccountsOfClient(Client client) {
        int count = client.getAccounts().size();
        double sum = 0;
        double balance;
        for (int i = 0; i < count; i++) {
            balance = client.getAccounts().get(i).getBalance();
            if (balance > 0) {
                sum += balance;
            }
        }
        return sum;
    }

    public static double calculateNegativeSumAccountsOfClient(Client client) {
        int count = client.getAccounts().size();
        double sum = 0;
        double balance;
        for (int i = 0; i < count; i++) {
            balance = client.getAccounts().get(i).getBalance();
            if (balance < 0) {
                sum += balance;
            }
        }
        return sum;
    }
}
