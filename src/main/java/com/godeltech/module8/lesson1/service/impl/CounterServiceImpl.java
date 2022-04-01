package com.godeltech.module8.lesson1.service.impl;

import com.godeltech.module8.lesson1.model.Counter;
import com.godeltech.module8.lesson1.service.CounterService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CounterServiceImpl implements CounterService {

    private final String prefix;
    private final Counter counter;

    @Override
    public void process() {
        inc();
        System.out.println(prefix + " " + counter.getCount());
    }

    @Override
    public Counter getCounter() {
        return counter;
    }

    @Override
    public void inc() {
        counter.setCount(counter.getCount() + counter.getIncrement());
    }
}
