package com.epam.payment.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
    private String buyerName;
    private ShoppingBasket shoppingBasket;

    public Payment(String buyerName) {
        this.buyerName = buyerName;
        this.shoppingBasket = new ShoppingBasket();
    }

    public static class ShoppingBasket {
        private List<Product> products = new ArrayList<>();
        private BigDecimal amountOfPurchase = new BigDecimal("0.0");

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public void setAmountOfPurchase(BigDecimal amountOfPurchase) {
            this.amountOfPurchase = amountOfPurchase;
        }

        public void addProduct(Product product) {
            products.add(product);
            setAmountOfPurchase(amountOfPurchase.add(BigDecimal.valueOf(product.getPrice())));
        }

        public void deleteProduct(Product product) {
            products.remove(product);
            setAmountOfPurchase(amountOfPurchase.subtract(BigDecimal.valueOf(product.getPrice())));
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ShoppingBasket that = (ShoppingBasket) o;
            return Objects.equals(products, that.products) && Objects.equals(amountOfPurchase, that.amountOfPurchase);
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
