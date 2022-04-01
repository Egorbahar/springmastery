package com.godeltech.module8.lesson1;

public class CounterService {

    private final String prefix;
    private final Counter counter;

    public CounterService(String prefix) {
        this.prefix = prefix;
        this.counter = new Counter(5);
    }

    public void process() {
        counter.inc();
        System.out.println(prefix + " " + counter.getCount());
    }

    public Counter getCounter() {
        return counter;
    }
}
