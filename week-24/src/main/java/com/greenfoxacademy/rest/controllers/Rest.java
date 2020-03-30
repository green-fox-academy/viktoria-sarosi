package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.ErrorMessage;
import com.greenfoxacademy.rest.models.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @GetMapping("greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam (required = false) String title) {
        if ((name == null) && (title == null)){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        }else if ((name == null)){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        }else if ((title == null)){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        }else{
            return ResponseEntity.status(200).body(new Greeter(name, title));
        }
    }
}
