package ru.gb.jcore.model;

import java.util.Date;
import java.util.List;


public class Manager extends Employee {

    public Manager(String firstName, String secondName, Date birthDate, String phone) {
        super(firstName, secondName, birthDate, phone);
    }

    public static void raiseSalary(List<Employee> employees, int age, int value) {
        for(Employee employee: employees) {
            if( !(employee instanceof Manager) && (employee.getAge() > age) ) {
                employee.raiseSalary(value);
            }
        }
    }
}
