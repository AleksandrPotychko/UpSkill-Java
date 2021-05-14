package com.epam.simpleclassesandobects.entity;

public class Counter {
    private int minValue;
    private int maxValue;
    private int count;
    final int DEFAULT_VALUE = 50;
    final int DEFAULT_MIN_VALUE = 1;
    final int DEFAULT_MAX_VALUE = 99;

    public Counter() {
        this.count = DEFAULT_VALUE;
        this.minValue = DEFAULT_MIN_VALUE;
        this.maxValue = DEFAULT_MAX_VALUE;
    }

    public Counter(boolean isRandom, int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        if (isRandom) {
            this.count = (int) (Math.random() * 100);
        } else {
            this.count = DEFAULT_VALUE;
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count > maxValue || count < minValue) {
            throw new ArrayIndexOutOfBoundsException(count);
        } else {
            this.count = count;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count = " + count +
                '}';
    }
}
