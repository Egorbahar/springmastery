package com.godeltech.module8.lesson1;

public class SpringMasteryApplication {

    public static void main(String[] args) {
        CounterService counterService = new CounterService("Students:");
        counterService.getCounter().setIncrement(32);

        counterService.process();

    }

}
