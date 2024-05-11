package ru.gb.jcore.model.services;

import ru.gb.jcore.model.Gender;
import ru.gb.jcore.model.Holiday;
import ru.gb.jcore.model.Person;

import java.util.List;

/**
 * Класс предоставляет метод generateCongratulations, выполняющий
 * формирование поздравлений согдасно списка объектов - наследников
 * класса Person
 */
public class ServiceCongratulations<T extends Person> {
    /**
     * Метод формирует строку поздравлений согласно списка list
     * @param list списов объектов, наследников класса Person
     * @param holiday праздник из перечисления Holiday
     * @return строку поздравления
     */
    public String generateCongratulations(List<T> list, Holiday holiday) {
        String msg =  holiday.getCongratulation();
        switch (holiday) {
            case FEB_23 -> {
                return congratulate23Fed(list, msg);
            }
            case MARCH_8 ->  {
                return congratulate8Marth(list, msg);
            }
            default -> {
                return congratulateGoodMorning(list, msg); // NEW_YEAR, NONE
            }

        }

    }

    // Частный случай поздравления
    private String congratulate8Marth(List<T> list, String msg1) {
        StringBuilder sb = new StringBuilder();
        String msg2 = Holiday.NONE.getCongratulation();
        for (T item: list) {
            String congr = (item.getGender() == Gender.FEMALE)
                    ? msg1 : msg2;

            sb.append(item.getFullName())
                    .append(congr)
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    // Частный случай поздравления
    private String congratulate23Fed(List<T> list, String msg1) {
        StringBuilder sb = new StringBuilder();
        String msg2 = Holiday.NONE.getCongratulation();
        for (T item: list) {
            String congr = (item.getGender() == Gender.MALE)
                    ? msg1 : msg2;

            sb.append(item.getFullName())
                    .append(congr)
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    // Одно поздравление для всех
    private String congratulateGoodMorning(List<T> list, String msg) {
        StringBuilder sb = new StringBuilder();
        list.forEach(n -> sb.append(n.getFullName())
                .append(msg)
                .append(System.lineSeparator()));
        return sb.toString();
    }

}
