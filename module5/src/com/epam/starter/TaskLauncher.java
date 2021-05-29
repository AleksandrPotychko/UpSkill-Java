package com.epam.starter;

import com.epam.entity.Directory;
import com.epam.entity.Payment;
import com.epam.unit.FileInitializer;
import com.epam.unit.ProductInitializer;

public class TaskLauncher {
    private static String directoryName = "Folder";
    private static final String FILE_NAME = "Empty file";
    private static final String SECOND_FILE_NAME = "Siri";
    private static final String BUYER_NAME = " Wally";

    public static void main(String[] args) {

        // Task 1
        Directory directory = new Directory(directoryName, FileInitializer.createFiles());
        directory.createFile(FILE_NAME);
        directory.getFiles().get(0).renameFile(SECOND_FILE_NAME);
        System.out.println(directory);
        directory.deleteFile(FILE_NAME);
        System.out.println(directory);

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
