package com.example.carrentalproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

// serve web pages

@Controller
public class AppController {

    @GetMapping("/") // handles HTTP request
    public String viewHomePage() {
        return "home";
    }
}
