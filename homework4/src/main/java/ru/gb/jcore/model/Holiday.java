package ru.gb.jcore.model;

import java.util.Date;

/**
 * Перечисление содержит праздничные дни
 * метод getHoliday(Date) определяет соответствующий праздничный день по параметру Date
 * метод getCongratulation() возвращает текст поздравительного сообщения
 */
public enum Holiday {
    NONE(0, 0, ", celebrate this morning!"),
    NEW_YEAR(0, 1, ", happy New Year!"),
    MARCH_8(2, 8, ", happy march 8th!"),
    FEB_23(1, 23, ", happy February 23rd!");
    private int month;
    private int day;
    private String congratulation;

    Holiday(int m, int d, String msg) {
        month = m;
        day = d;
        congratulation = msg;
    }

    /**
     * Возвращает текст поздравительного сообщения
     * @return текст поздравительного сообщения
     */
    public String getCongratulation() { return congratulation;}

    /**
     * Метод getHoliday(Date) определяет соответствующий праздничный день по параметру Date
     * @param date дата
     * @return значение перечисления Holiday
     */
    public static Holiday getHoliday(Date date) {
        int m = date.getMonth();
        int d = date.getDate();

        for(Holiday h: Holiday.values()){
            if(h.day == d && h.month == m)
                return h;
        };
        return NONE;
    }
}
