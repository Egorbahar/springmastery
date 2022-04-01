package com.godeltech.module8.lesson1.config;

import com.godeltech.module8.lesson1.service.impl.CounterServiceImpl;
import com.godeltech.module8.lesson1.model.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Counter counter() {
        return new Counter(5);
    }

    @Bean
    public CounterServiceImpl counterServiceImpl() {
        return new CounterServiceImpl("Students:", counter());
    }
}
