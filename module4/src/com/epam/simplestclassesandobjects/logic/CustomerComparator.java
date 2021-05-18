package com.epam.simplestclassesandobjects.logic;

import com.epam.simplestclassesandobjects.entity.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getSurname().compareTo(customer2.getSurname());
    }
}
