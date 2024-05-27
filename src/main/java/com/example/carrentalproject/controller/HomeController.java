package com.example.carrentalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {

    @GetMapping("/")
    public String home() {
        return "You need to log in! (please??)";
    }

    @GetMapping("/secured")
    public String secured() {
        return "You're logged in!";
    }
}