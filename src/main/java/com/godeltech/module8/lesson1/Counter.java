package com.godeltech.module8.lesson1;

public class Counter {

    private int increment = 1;
    private int count = 0;

    public Counter() {
    }

    public Counter(int initialCount) {
        this.count = initialCount;
    }

    public void inc() {
        count += increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getCount() {
        return count;
    }
}
