package com.epam.payment.starter;

import com.epam.payment.entity.Payment;
import com.epam.payment.unit.ProductInitializer;

public class TaskLauncher {
    private static final String BUYER_NAME = " Wally";

    public static void main(String[] args) {
        // Task 2
        Payment payment = new Payment(BUYER_NAME, new Payment.ShoppingBasket());
        System.out.println(payment);
        payment.getShoppingBasket().addProduct(ProductInitializer.createProducts().get(0));
        System.out.println(payment);
        payment.getShoppingBasket().addProduct(ProductInitializer.createProducts().get(1));
        System.out.println(payment);
        payment.getShoppingBasket().addProduct(ProductInitializer.createProducts().get(2));
        System.out.println(payment);
        payment.getShoppingBasket().deleteProduct(ProductInitializer.createProducts().get(0));
        System.out.println(payment);
    }
}
