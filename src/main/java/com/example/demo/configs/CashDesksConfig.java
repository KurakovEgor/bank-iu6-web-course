package com.example.demo.configs;

import com.example.demo.services.CashDeskService;
import com.example.demo.services.ClosedCashDeskService;
import com.example.demo.services.RandomCashDeskService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashDesksConfig {

    @Bean
    public CashDeskService cashDeskService1() {
        return new RandomCashDeskService();
    }

    @Bean
    @ConditionalOnProperty("needAlwaysClosedCashDesk")
    public CashDeskService cashDeskService2() {
        return new ClosedCashDeskService();
    }

}
