package com.godeltech.module8.lesson1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {

    private int increment;
    private int count;

    public Counter(int count) {
        this.count = count;
    }
}
