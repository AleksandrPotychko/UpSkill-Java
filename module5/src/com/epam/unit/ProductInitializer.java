package com.epam.unit;

import com.epam.entity.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductInitializer {
    public static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 2.3));
        products.add(new Product("Butter", 12.77));
        products.add(new Product("Bread", 5.1));
        return products;
    }
}
