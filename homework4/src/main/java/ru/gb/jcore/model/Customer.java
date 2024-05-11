package ru.gb.jcore.model;
import java.util.Date;

public class Customer extends Person{

    public Customer(String firstName, String secondtName, Date birthDate, String phone) {
        super(firstName, secondtName, birthDate, phone);
    }

    public Customer(String firstName, String secondtName, Date birthDate, String phone, Gender gender) {
        super(firstName, secondtName, birthDate, phone, gender);
    }
}

