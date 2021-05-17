package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.Account;
import com.epam.aggregationandcomposition.entity.Client;
import java.util.ArrayList;
import java.util.List;

public class BankInitializer {
    public static List<Account> createAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(3));
        accounts.add(new Account(5));
        accounts.add(new Account(-5));
        accounts.add(new Account(7));
        accounts.add(new Account(-9));
        accounts.add(new Account(10));
        return accounts;
    }

    public static List<Client> createClients() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Alex", BankInitializer.createAccounts()));
        clients.add(new Client("Ben", BankInitializer.createAccounts()));
        clients.add(new Client("Sheldon", BankInitializer.createAccounts()));
        return clients;
    }
}
