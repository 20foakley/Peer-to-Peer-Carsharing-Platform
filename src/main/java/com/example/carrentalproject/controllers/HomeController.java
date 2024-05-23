package com.example.carrentalproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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