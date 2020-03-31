package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.Services;
import com.greenfoxacademy.rest.models.dtos.ArrayHandler;
import com.greenfoxacademy.rest.models.entities.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest {

    private Services service;

    public Rest(Services service) {
        this.service = service;
    }

    @GetMapping("greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if ((name == null) && (title == null)) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if ((name == null)) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        } else if ((title == null)) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        } else {
            return ResponseEntity.status(200).body(new Greeter(name, title));
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(name = "appendable", required = false) String appendable) {
        if (appendable == null) {
            return (ResponseEntity) ResponseEntity.status(404).body(new DoubledError());
        } else {
            return ResponseEntity.status(200).body(new Appending(appendable));
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable(name = "action", required = false) String action, @RequestBody DoUntil until) {
        if ((action != null) && (until != null)) {
            return ResponseEntity.status(200).body(service.doUntil(until, action));
        } else {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity arrayHandler(@RequestBody ArrayHandler arrayhandler) {
        if ((arrayhandler.getWhat() == null) || (arrayhandler.getNumbers() == null)) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));
        } else if (arrayhandler.getWhat().equals("double")) {
            return ResponseEntity.status(200).body(service.handleArray(arrayhandler));
        } else {
            return ResponseEntity.status(200).body(service.handleSumOrMultiply(arrayhandler));
        }
    }

}