package com.epam.calendar.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Calendar {
    private int year;
    private List<Holiday> holidays;
    private List<Weekend> weekends;
    private static byte NUMBER_OF_FIRST_MONTH = 1;
    private static byte NUMBER_OF_FIRST_DAY = 1;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
        this.weekends = new ArrayList<>();
        addWeekend(year);
    }

    private void addWeekend(int year) {
        LocalDate date = LocalDate.of(year, NUMBER_OF_FIRST_MONTH,NUMBER_OF_FIRST_DAY);
        while (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                weekends.add(new Weekend(date, "Saturday"));
                date = date.plusDays(1);
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                weekends.add(new Weekend(date, "Sunday"));
                date = date.plusDays(1);
            } else {
                date = date.plusDays(1);
            }
        }
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
        return year == calendar.year && Objects.equals(holidays, calendar.holidays) && Objects.equals(weekends, calendar.weekends);
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
                weekends +
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

    private static class Weekend {
        private LocalDate weekendDate;
        private String weekendName;

        public Weekend(LocalDate weekendDate, String weekendName) {
            this.weekendDate = weekendDate;
            this.weekendName = weekendName;
        }

        public LocalDate getWeekendDate() {
            return weekendDate;
        }

        public void setWeekendDate(LocalDate weekendDate) {
            this.weekendDate = weekendDate;
        }

        public String getWeekendName() {
            return weekendName;
        }

        public void setWeekendName(String weekendName) {
            this.weekendName = weekendName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Weekend weekend = (Weekend) o;
            return Objects.equals(weekendDate, weekend.weekendDate) && Objects.equals(weekendName, weekend.weekendName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(weekendDate, weekendName);
        }

        @Override
        public String toString() {
            return "Weekend {" + weekendDate + " " + weekendName + '}';
        }
    }
}
