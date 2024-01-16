package com.example.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getWelcome() {

        return "welcome";
    }

    @PostMapping("/invoice")
    public String addPost(){


        return "invoice";
    }
}
