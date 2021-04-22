package com.epam.logic;

import com.epam.entity.Time;

public class TimeWorker {
    public static Time changeTime(Time time, int increasedHours, int increasedMinutes, int increasedSeconds) {
        time.setHours(time.getHours() + increasedHours);
        time.setMinutes(time.getMinutes() + increasedMinutes);
        time.setSeconds(time.getSeconds() + increasedSeconds);
        return time;
    }
}
