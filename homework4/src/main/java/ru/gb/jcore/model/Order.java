package ru.gb.jcore.model;

public class Order {
    Customer customer;
    Product product;
    int count;

    public Order(Customer customer, Product product, int count) {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order:" + System.lineSeparator() +
                "customer: " + customer.getFullName() + System.lineSeparator() +
                "product: " + product.getName() +
                " " + count +
                " * " + product.getPrice() +
                " = " + count * product.getPrice();
    }
}
