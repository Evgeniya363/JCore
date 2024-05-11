package ru.gb.jcore.model;

public class Product {
    private String name;
    private float price;
    private int count;

    public Product(String name, float price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +
                " " + price +
                " * " + count +
                " = " + price * count;
    }
}
