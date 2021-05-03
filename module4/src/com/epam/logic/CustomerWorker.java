package com.epam.logic;

import com.epam.entity.Customer;
import java.util.ArrayList;


public class CustomerWorker {
    public static ArrayList<Customer> findBuyersWhoseCreditCardInTheRange(Customer[] customers, int minBorder,
                                                                          int maxBorder) {
        ArrayList<Customer> buyers = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            final int BUYER_CREDIT_CARD_NUMBER = customers[i].getCreditCardNumber();
            if (BUYER_CREDIT_CARD_NUMBER > minBorder && maxBorder > BUYER_CREDIT_CARD_NUMBER) {
                buyers.add(customers[i]);
            }
        }
        return buyers;
    }
}
