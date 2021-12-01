package com.fivepoints.spring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("posts")
public class WelcomeController {
    @RequestMapping(value = "/welcome",  method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello world";
    }
}
