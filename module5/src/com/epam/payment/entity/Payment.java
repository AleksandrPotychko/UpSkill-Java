package com.epam.payment.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
    private String buyerName;
    private ShoppingBasket shoppingBasket;

    public Payment(String buyerName, ShoppingBasket shoppingBasket) {
        this.buyerName = buyerName;
        this.shoppingBasket = shoppingBasket;
    }

    public static class ShoppingBasket {
        private List<Product> products = new ArrayList<>();
        private double amountOfPurchase;

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public void setAmountOfPurchase(double amountOfPurchase) {
            this.amountOfPurchase = amountOfPurchase;
        }

        public void addProduct(Product product) {
            products.add(product);
            amountOfPurchase += product.getPrice();
        }

        public void deleteProduct(Product product) {
            amountOfPurchase -= product.getPrice();
            products.remove(product);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ShoppingBasket that = (ShoppingBasket) o;
            return Double.compare(that.amountOfPurchase, amountOfPurchase) == 0 && Objects.equals(products, that.products);
        }

        @Override
        public int hashCode() {
            return Objects.hash(products, amountOfPurchase);
        }

        @Override
        public String toString() {
            return " Shopping basket {" +
                    "products:" + products +
                    ", amount of purchase = " + amountOfPurchase +
                    '}';
        }
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String nameBuyer) {
        this.buyerName = nameBuyer;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(buyerName, payment.buyerName) && Objects.equals(shoppingBasket, payment.shoppingBasket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerName, shoppingBasket);
    }

    @Override
    public String toString() {
        return "Payment: "+ buyerName + shoppingBasket;
    }
}
