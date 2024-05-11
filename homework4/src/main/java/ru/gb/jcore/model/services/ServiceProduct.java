package ru.gb.jcore.model.services;

import ru.gb.jcore.model.Customer;
import ru.gb.jcore.model.Product;
import ru.gb.jcore.model.exceptions.ProductException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceProduct {
    private static List<Product> products = new ArrayList<>();
    public Product add(String name, float price, int count) {
        Product product = new Product(name, price, count);
        products.add(product);
        return product;
    }

    public static Product getProduct(String name) {
        for(Product p: products) {
            if(p.getName().equals(name))
                return p;
        }
        throw new ProductException(name);
    }
}
