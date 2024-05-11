package ru.gb.jcore.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
 */

public class Employee extends Person{
    private String post;
    private  int salary;

    public Employee(String firstName, String secondName, Date birthDate, String phone) {
        super(firstName, secondName, birthDate, phone);
    }

    public Employee(String firstName, String secondtName, Date birthDate, String phone, Gender gender) {
        super(firstName, secondtName, birthDate, phone, gender);
    }

    @Override
    public String toString() {
        return  getFullName() +
                ", post: " + post +
                ", phone: " + phone +
                ", salary: " + salary +
                ", age: " + getAge();
    }

    public int getAge() {
        return LocalDateTime.now().getYear()- birthDate.getYear();
    }

    public void raiseSalary(int value) {
        salary += value;
    }


}
