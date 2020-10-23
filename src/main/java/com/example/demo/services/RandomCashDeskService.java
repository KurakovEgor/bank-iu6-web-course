package com.example.demo.services;

import com.example.demo.Money;
import org.springframework.stereotype.Component;

import java.util.Random;

public class RandomCashDeskService implements CashDeskService {

    private Random random = new Random();

    public Money getMoney() {
        return new Money();
    }

    public boolean isOpen() {
        return random.nextBoolean();
    }

}
