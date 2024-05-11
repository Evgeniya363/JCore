package ru.gb.jcore.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String firstName;
    protected String secondName;
    protected Date birthDate;
    protected String phone;
    protected Gender gender;
    private static final DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public Person(String firstName, String secondName, Date birthDate, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public Person(String firstName, String secondName, Date birthDate, String phone, Gender gender) {
        this(firstName, secondName, birthDate, phone);
        this.gender = gender;
    }

    public String getFullName() {
        return firstName + " " + secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  firstName + ' ' +
                secondName + ", " +
                ( (gender == null) ? "" : gender.getGender() + ", ") +
                ((birthDate == null) ? "" : df.format(birthDate) + ", ") +
                phone;
    }
}
