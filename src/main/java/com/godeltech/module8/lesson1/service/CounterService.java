package com.godeltech.module8.lesson1.service;

import com.godeltech.module8.lesson1.model.Counter;

public interface CounterService {
    void process();

    Counter getCounter();

    void inc();
}
