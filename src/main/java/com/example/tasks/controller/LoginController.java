package com.example.tasks.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {


    @PostMapping("/api/login")
    public ResponseEntitiy<?> login() {
        //Implementing login logic here
        return null;
    }
}
