package com.godeltech.module8.lesson1;

import com.godeltech.module8.lesson1.service.impl.CounterServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMasteryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringMasteryApplication.class);
        CounterServiceImpl counterServiceImpl = (CounterServiceImpl) applicationContext.getBean("counterServiceImpl");
        counterServiceImpl.getCounter().setIncrement(32);
        counterServiceImpl.process();
    }

}
