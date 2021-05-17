package com.epam.aggregationandcomposition.entity;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Client {
    private static int startId  = 0;
    private int id;
    private String name;
    private List<Account> accounts;

    public Client(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
        this.id = ++startId;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public double calculatePositiveSum() {
        int count = getAccounts().size();
        double sum = 0;
        double balance;
        for (int i = 0; i < count; i++) {
            balance = getAccounts().get(i).getBalance();
            if (balance > 0) {
                sum += balance;
            }
        }
        return sum;
    }

    public double calculateNegativeSum() {
        int count = getAccounts().size();
        double sum = 0;
        double balance;
        for (int i = 0; i < count; i++) {
            balance = getAccounts().get(i).getBalance();
            if (balance < 0) {
                sum += balance;
            }
        }
        return sum;
    }

    public double calculateBalanceAccounts() {
        int count = getAccounts().size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += getAccounts().get(i).getBalance();
        }
        return sum;
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, accounts);
    }

    @Override
    public String toString() {
        return "Client: " +
                "id = " + id +
                ", name = " + name +
                " " + accounts +
                '.';
    }
}
