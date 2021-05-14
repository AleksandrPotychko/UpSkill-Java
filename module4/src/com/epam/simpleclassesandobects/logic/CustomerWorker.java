package com.epam.simpleclassesandobects.logic;

import com.epam.simpleclassesandobects.entity.Customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerWorker {
    public static List<Customer> findBuyersWhoseCreditCardInTheRange(Customer[] customers, int minBorder,
                                                                     int maxBorder) {
        List<Customer> buyers = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            final int BUYER_CREDIT_CARD_NUMBER = customers[i].getCreditCardNumber();
            if (BUYER_CREDIT_CARD_NUMBER > minBorder && maxBorder > BUYER_CREDIT_CARD_NUMBER) {
                buyers.add(customers[i]);
            }
        }
        return buyers;
    }
}
