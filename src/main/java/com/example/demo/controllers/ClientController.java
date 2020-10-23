package com.example.demo.controllers;

import ch.qos.logback.core.net.server.Client;
import com.example.demo.Money;
import com.example.demo.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClientController {

    private BankService bankService;

    private ClientController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/money")
    public ResponseEntity<Money> getMoney(@RequestBody Money money) {
        ResponseEntity<Money> responseEntity = new ResponseEntity<>(bankService.getMoney(), HttpStatus.OK);
        return responseEntity;
    }
}
