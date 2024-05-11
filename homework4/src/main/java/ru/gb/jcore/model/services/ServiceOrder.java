package ru.gb.jcore.model.services;

import ru.gb.jcore.model.Customer;
import ru.gb.jcore.model.Order;
import ru.gb.jcore.model.Product;
import ru.gb.jcore.model.exceptions.AmountException;
import ru.gb.jcore.model.exceptions.CustomerException;
import ru.gb.jcore.model.exceptions.NullAmountException;

import java.util.ArrayList;
import java.util.List;

public class ServiceOrder {
    private List<Order> orders = new ArrayList<>();
    public Order add(String customer, String product, int count) {

        Product product1;
        Customer customer1;
        try {
            customer1 = ServiceCustomers.getCustomer(customer);
            product1 = ServiceProduct.getProduct(product);
        } catch (CustomerException e) {
            throw new RuntimeException(e);
        }


        int maxcount = product1.getCount();

        if(maxcount < 1) {
            throw new NullAmountException(product1.getName());
        }
        if (count < 1 || count > maxcount) {
            throw new AmountException(count, maxcount);
        }

        Order order = new Order(customer1, product1, count);
        orders.add(order);
        return order;

    }
}
