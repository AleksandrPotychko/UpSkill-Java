package com.epam.logic;

import com.epam.entity.Customer;


public class CustomerWorker {

    public static Customer[] findCreditCardsInTheRange(Customer[] customers, int minBorder, int maxBorder) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCreditCardNumber() > minBorder && maxBorder > customers[i].getCreditCardNumber()) {
           customers[i] = customers[i];
            } else {
                customers[i] = null;
            }
        }
        return customers;
    }
}
