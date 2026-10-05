package com.example.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @GetMapping("/api/login")
    public String login() {
        //Implementing login logic here .........
        return "Logging in...";
    }
}
