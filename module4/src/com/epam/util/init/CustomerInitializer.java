package com.epam.util.init;

import com.epam.entity.Customer;

public class CustomerInitializer {
    private Customer[] customers;
    private int capacity;
    private int size;

    public Customer[] customer(int capacity) {
       return customers = new Customer[capacity];
    }
}
