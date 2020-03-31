package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.entities.Doubled;
import com.greenfoxacademy.rest.models.entities.DoubledError;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String renderIndex() {
        return "index";
    }

    @ResponseBody
    @GetMapping("doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            Doubled doubled = new Doubled(input);
            return ResponseEntity.status(200).body(doubled);
        } else {
            return ResponseEntity.status(200).body(new DoubledError());
        }
    }
}
