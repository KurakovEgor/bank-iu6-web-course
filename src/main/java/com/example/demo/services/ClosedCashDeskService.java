package com.example.demo.services;

import com.example.demo.Money;

public class ClosedCashDeskService implements CashDeskService {

    public Money getMoney() {
        return new Money();
    }

    public boolean isOpen() {
        System.out.println("Проверка всегда закрытой кассы");
        return false;
    }
}
