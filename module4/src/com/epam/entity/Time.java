package com.epam.entity;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private final int DEFAULT_HOURS = 0;
    private final int DEFAULT_MINUTES = 0;
    private final int DEFAULT_SECONDS = 0;
    private final int MIN_HOUR_MIN_SEC = 0;
    private final int MAX_MIN_SEC = 60;

    public Time() {
        this.hours = DEFAULT_HOURS;
        this.minutes = DEFAULT_MINUTES;
        this.seconds = DEFAULT_SECONDS;
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        int MAX_HOURS = 24;
        if (MIN_HOUR_MIN_SEC <= hours && hours <= MAX_HOURS) {
            this.hours = hours;
        } else {
            this.hours = DEFAULT_HOURS;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (MIN_HOUR_MIN_SEC <= minutes && minutes <= MAX_MIN_SEC) {
            this.minutes = minutes;
        } else {
            this.minutes = DEFAULT_MINUTES;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (MIN_HOUR_MIN_SEC <= seconds && seconds <= MAX_MIN_SEC) {
            this.seconds = seconds;
        } else {
            this.seconds = DEFAULT_SECONDS;
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
