package com.epam.simpleclassesandobects.logic;

import com.epam.simpleclassesandobects.entity.Counter;

public class CounterWorker {
    public static void increase(Counter counter) {
        if (counter.getCount() == counter.getMaxValue()) {
            throw new ArrayIndexOutOfBoundsException(counter.getCount() + 1);
        } else {
            counter.setCount(counter.getCount() + 1);
        }
    }

    public static void decrease(Counter counter) {
        if (counter.getCount() == counter.getMinValue()) {
            throw new ArrayIndexOutOfBoundsException(counter.getCount() - 1);
        } else {
            counter.setCount(counter.getCount() - 1);
        }
    }
}
