package com.epam.simplclassesandobjects.util.init;

import com.epam.simplclassesandobjects.entity.Customer;

public class CustomerInit {

    public static Customer[] createCustomer(int capacity) {
       Customer[] customers = new Customer[capacity];
       customers[0] = new Customer(1,"Smit", "Joe", "Bob", "Vitebsk", 2,
               100);
        customers[1] = new Customer(2,"Alduin", "Arni", "Martin", "Gomel", 11,
                200);
        customers[2] = new Customer(3,"Alduin", "Barny", "Rin", "Moon", 5,
                147);
        customers[3] = new Customer(4,"Anderson", "Mike", "Morrow", "Moon", 30,
                128);
        customers[4] = new Customer(5,"Lutor", "Lex", "Bob", "Borisov", 27,
                382);
        customers[5] = new Customer(6,"Smolvil", "Green", "Ketti", "London", 29,
                278);
        return customers;
    }
}
