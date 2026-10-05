package com.example.tasks.controller;

import com.example.tasks.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {


    @GetMapping("/api/login")
    public List<Task> getTasks() {
        return TASKS;
    }
}
