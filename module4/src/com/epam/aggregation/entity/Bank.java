package com.epam.aggregation.entity;

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
