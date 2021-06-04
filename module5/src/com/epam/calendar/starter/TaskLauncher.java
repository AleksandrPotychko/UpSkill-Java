package com.epam.calendar.starter;

import com.epam.calendar.entity.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class TaskLauncher {
    private static final int YEAR = 2021;

    public static void main(String[] args) {
        Calendar calendar = new Calendar(YEAR);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        calendar.addHoliday(LocalDate.parse("01.01." + YEAR, dateTimeFormatter), "New Year");
        calendar.addHoliday(LocalDate.parse("07.01." + YEAR, dateTimeFormatter), "Christmas");
        calendar.addHoliday(LocalDate.parse("08.03." + YEAR, dateTimeFormatter), "Women’s Day");
        calendar.addHoliday(LocalDate.parse("01.05." + YEAR, dateTimeFormatter), "Labour Day");
        calendar.addHoliday(LocalDate.parse("09.05." + YEAR, dateTimeFormatter), "Victory Day");
        System.out.println(calendar);
        calendar.removeHoliday(calendar,"Labour Day");
        System.out.println(calendar);
    }
}
