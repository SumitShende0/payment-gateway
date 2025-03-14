package com.financial.payment_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/home")
    public String home() {
        return "Welcome to the Payment Gateway!";
    }
}
