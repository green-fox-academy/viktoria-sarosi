package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoof {
    AtomicLong counter = new AtomicLong(1);


    @RequestMapping(value = "/web/fizzbuzzwoof", method = RequestMethod.GET)
    public String fizzBuzz(Model model) {
        counter.getAndIncrement();
        int count = counter.intValue();
        String result = "";
        if (count % 3 == 0) {
            model.addAttribute("result", (result += "Fizz"));
        }
        if (count % 5 == 0) {
            model.addAttribute("result", (result += "Buzz"));
        }
        if (count % 7 == 0) {
            model.addAttribute("result", (result += "Woof"));
        }
        else if ((count % 3 != 0) && (count % 5 != 0) && (count % 7 != 0)) {
            model.addAttribute("result", (result = counter.toString()));
        }
        return"fizz";
    }

}
//TODO számlálót kijavitani