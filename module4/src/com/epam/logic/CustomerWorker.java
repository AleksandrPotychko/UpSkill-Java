package com.epam.logic;

import com.epam.entity.Customer;


public class CustomerWorker {

    public static Customer findBuyerWhoseCreditCardInTheRange(Customer customer, int minBorder, int maxBorder) {
        final int BUYER_CREDIT_CARD_NUMBER = customer.getCreditCardNumber();
        Customer BUYER = null;
        if (BUYER_CREDIT_CARD_NUMBER > minBorder && maxBorder > BUYER_CREDIT_CARD_NUMBER) {
            BUYER = customer;
        }
        return BUYER;
    }
}
