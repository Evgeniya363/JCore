package ru.gb.jcore;

import java.util.Comparator;

public class EmployeeDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
       return ((o2.getBirthYear()<<11) +(o2.getBirthMonth()<<6) + o2.getBirthDay()) -
               ((o1.getBirthYear()<<11) + (o1.getBirthMonth()<<6) + o1.getBirthDay()) ;
    }
}
