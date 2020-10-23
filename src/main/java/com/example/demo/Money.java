package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Money {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer amount = 1000;

    private String currency = "USD";

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
