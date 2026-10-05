package com.example.tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @PostMapping("/api/auth/login")
    public ResponseEntity<?> login() {
        //Implementing login logic here
        return ResponseEntity.ok("Logged In");
    }
}
