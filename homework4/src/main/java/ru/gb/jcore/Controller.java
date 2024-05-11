package ru.gb.jcore;

import ru.gb.jcore.model.*;
import ru.gb.jcore.model.exceptions.AmountException;
import ru.gb.jcore.model.exceptions.CustomerException;
import ru.gb.jcore.model.exceptions.NullAmountException;
import ru.gb.jcore.model.exceptions.ProductException;
import ru.gb.jcore.model.services.ServiceCongratulations;
import ru.gb.jcore.model.services.ServiceCustomers;
import ru.gb.jcore.model.services.ServiceOrder;
import ru.gb.jcore.model.services.ServiceProduct;

import java.util.Date;
import java.util.List;


public class Controller {
    private static final ServiceOrder so = new ServiceOrder();
    private static final ServiceCustomers sc = new ServiceCustomers();
    private static final ServiceProduct sp = new ServiceProduct();
    private static final ServiceCongratulations<Customer> sco = new ServiceCongratulations<>();
    public static Order addOrder(String customer, String product, int count) {
        try {
            return so.add(customer, product, count);
        } catch (CustomerException e) {
            e.printStackTrace();
        } catch (ProductException | NullAmountException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (AmountException e) {
            System.out.println(e.getMessage());
            return so.add(customer, product, 1);
        }
        return null;
    }

    public static List<Customer> getCustomers() {
        return ServiceCustomers.getCustomers();
    }

    public static String generateCongratulation(List<Customer> customers, Holiday today) {
        return sco.generateCongratulations(customers,today);
    }

    public Customer addCustomer(String name, String surName, Date date, String phone) {
//        try {
            return sc.add(name, surName, date, phone);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }

    }

    public Customer addCustomer(String name, String surName, Date date, String phone, Gender gender) {
       Customer customer = addCustomer(name, surName, date, phone);
       customer.setGender(gender);
       return customer;
    }

    public Product addProduct(String name, float price, int count) {
        try {
            return sp.add(name, price, count);
        } catch (Exception e) {
            return null;
        }
    }

    public static String customersList() {
        return ServiceCustomers.getCustomersList();
    };

    public boolean setGender(String fullName, Gender gender) {
        try {
            ServiceCustomers.getCustomer(fullName).setGender(gender);
            return true;
        } catch (CustomerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
