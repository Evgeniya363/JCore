package ru.gb.jcore.model.services;

import ru.gb.jcore.model.Customer;
import ru.gb.jcore.model.exceptions.CustomerException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceCustomers {
    private DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
    private static List<Customer> customers = new ArrayList<>();

    public static List<Customer> getCustomers() {
        return customers;
    }

    public Customer add(String name, String secondName, Date date, String phone) {
        Customer customer = new Customer(name, secondName, date, phone);
        customers.add(customer);
        return customer;
    }

    public static Customer getCustomer(String name) throws CustomerException {
        for(Customer c: customers) {
            if(c.getFullName().equals(name))
                return c;
        }
        throw  new CustomerException(name);
    }

    public static String getCustomersList() {
        StringBuilder sb = new StringBuilder();
        customers.forEach(n -> sb.append(n.toString()).append("\n"));
        return sb.toString();
    }

}
