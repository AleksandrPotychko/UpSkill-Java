package com.epam.aggregationandcomposition.entity;

import java.util.List;
import java.util.Objects;

public class Bank {
    private String name;
    private List<Client> clients;

    public Bank(String name, List<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public double calculatePositiveSumAccountsAllClients() {
        int count = getClients().size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += getClients().get(i).calculatePositiveSum();
        }
        return sum;
    }

    public double calculateNegativeSumAccountsAllClients() {
        int count = getClients().size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += getClients().get(i).calculateNegativeSum();
        }
        return sum;
    }

    public double calculateBalanceAccountsAllClients() {
        int count = getClients().size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += getClients().get(i).calculateBalanceAccounts();
        }
        return sum;
    }

    public Account findAccountById(int accountId) {
        int countClients = getClients().size();
        Account account = null;
        for (int i = 0; i < countClients; i++) {
            int countAccounts = getClients().get(i).getAccounts().size();
            for (int j = 0; j < countAccounts; j++) {
                if (accountId == getClients().get(i).getAccounts().get(j).getId()) {
                    account = getClients().get(i).getAccounts().get(j);
                }
            }
        }
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) && Objects.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }

    @Override
    public String toString() {
        return "Bank " + name +
                clients +
                '.';
    }
}
