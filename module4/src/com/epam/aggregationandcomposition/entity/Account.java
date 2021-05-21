package com.epam.aggregationandcomposition.entity;

import java.util.Objects;

public class Account {
    private static int startId  = 0;
    private int id;
    private double balance;
    private boolean isBlocked = false;

    public Account(double balance) {
        this.balance = balance;
        this.id = ++startId;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Double.compare(account.balance, balance) == 0 && isBlocked == account.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, isBlocked);
    }

    @Override
    public String toString() {
        return "Account: " +
                "id = " + id +
                ", balance = " + balance + "\n";
    }
}
