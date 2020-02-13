package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounterApp {
    AtomicLong greetCount = new AtomicLong(1);

    @RequestMapping(value = "/greetingCount")
    public String greetingCounter(@RequestParam(value = "name") String name) {
        greetCount.getAndIncrement();
        return "greetcount: " + greetCount + ", " + "content: " + "Hello " + name;
    }
}
