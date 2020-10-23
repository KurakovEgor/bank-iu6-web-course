package com.example.demo.services;

import com.example.demo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    private List<CashDeskService> cashDesks;

    public Money getMoney() {
        var opendedCashDesk = cashDesks.stream().filter(cashDesk -> cashDesk.isOpen()).findFirst();
        if (opendedCashDesk.isPresent()) {
            return opendedCashDesk.get().getMoney();
        } else {
            var money = new Money();
            money.setAmount(0);
            return money;
        }
    }

    public List<CashDeskService> getCashDesks() {
        return cashDesks;
    }

    @Autowired
    public void setCashDesks(List<CashDeskService> cashDesks) {
        this.cashDesks = cashDesks;
    }
}
