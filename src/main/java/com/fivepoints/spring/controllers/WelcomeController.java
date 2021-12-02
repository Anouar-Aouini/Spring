package com.fivepoints.spring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
    @GetMapping(value = "/welcome")
    public String hello(){
        return "Hello world";
    }
}
