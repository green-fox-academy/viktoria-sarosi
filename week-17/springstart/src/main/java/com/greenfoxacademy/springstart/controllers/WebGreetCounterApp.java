package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterApp {
    private AtomicLong greetCount = new AtomicLong(1);
    @RequestMapping("/web/greetings")
    public String greeting(@RequestParam(value = "name")String name, Model model) {
        greetCount.getAndIncrement();
        model.addAttribute("name", " Chana");
        model.addAttribute("greetCount", greetCount);
        return "greeting";
    }
}
