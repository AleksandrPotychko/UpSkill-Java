package com.epam.simplestclassesandobjects.entity;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private final int MIN_HOUR_MIN_SEC = 0;
    private final int MAX_MIN_SEC = 60;


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        int MAX_HOURS = 24;
        if (MIN_HOUR_MIN_SEC <= hours && hours <= MAX_HOURS) {
            this.hours = hours;
        } else {
            this.hours = MIN_HOUR_MIN_SEC;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (MIN_HOUR_MIN_SEC <= minutes && minutes <= MAX_MIN_SEC) {
            this.minutes = minutes;
        } else {
            this.minutes = MAX_MIN_SEC;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (MIN_HOUR_MIN_SEC <= seconds && seconds <= MAX_MIN_SEC) {
            this.seconds = seconds;
        } else {
            this.seconds = MIN_HOUR_MIN_SEC;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
