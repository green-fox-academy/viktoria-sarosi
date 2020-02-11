package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTApp {
    @RequestMapping(value = "/greetings")
    public Greeting greetings (@RequestParam(value = "name", required = true) String name){
        return new Greeting(1, "Hello "+ name);
    }
}
