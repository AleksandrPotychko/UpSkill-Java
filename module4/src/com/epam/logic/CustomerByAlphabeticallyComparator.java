package com.epam.logic;

import com.epam.entity.Customer;

import java.util.Comparator;

public class CustomerByAlphabeticallyComparator implements Comparator<Customer> {
    public int compare(Customer customer1, Customer customer2) {
        final int comparisonBySurname = customer1.getSurname().compareTo(customer2.getSurname());
        return (comparisonBySurname != 0) ? comparisonBySurname : customer1.getName().compareTo(customer2.
                getName());
    }
}
