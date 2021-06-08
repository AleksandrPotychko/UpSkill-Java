package com.epam.calendar.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Calendar {
    private int year;
    private List<Holiday> holidays;
    private int weekends;
    private static byte NUMBER_OF_FIRST_MONTH = 1;
    private static byte NUMBER_OF_FIRST_DAY = 1;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
        addWeekends(year);
    }

    private void addWeekends(int year) {
        LocalDate date = LocalDate.of(year, NUMBER_OF_FIRST_MONTH,NUMBER_OF_FIRST_DAY);
        this.weekends = date.lengthOfYear() / 7 * 2;
    }

    public void addHoliday(LocalDate holidayDate, String nameOfHoliday) {
        holidays.add(new Holiday(holidayDate, nameOfHoliday));
    }

    public Calendar removeHoliday(Calendar calendar, String nameOfHoliday) {
        for (int i = 0; i < calendar.holidays.size(); i++) {
            if (calendar.holidays.get(i).nameOfHoliday.equals(nameOfHoliday)) {
                calendar.holidays.remove(i);
            }
        }
        return calendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year && weekends == calendar.weekends && Objects.equals(holidays, calendar.holidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, holidays, weekends);
    }

    @Override
    public String toString() {
        return "Calendar {" +
                "year = " + year +
                holidays +
                " Weekends days = " + weekends +
                '}';
    }

    private static class Holiday {
        private LocalDate holidayDate;
        private String nameOfHoliday;

        public Holiday(LocalDate holidayDate, String nameOfHoliday) {
            this.holidayDate = holidayDate;
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public void setHolidayDate(LocalDate holidayDate) {
            this.holidayDate = holidayDate;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Holiday holiday = (Holiday) o;
            return Objects.equals(holidayDate, holiday.holidayDate) && Objects.equals(nameOfHoliday, holiday.nameOfHoliday);
        }

        @Override
        public int hashCode() {
            return Objects.hash(holidayDate, nameOfHoliday);
        }

        @Override
        public String toString() {
            return "Holidays {" + holidayDate + " " + nameOfHoliday + '}';
        }
    }
}
