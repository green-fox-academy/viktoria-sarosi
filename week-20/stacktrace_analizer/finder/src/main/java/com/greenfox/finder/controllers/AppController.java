package com.greenfox.finder.controllers;

import com.greenfox.finder.models.User;
import com.greenfox.finder.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

     private UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model, @ModelAttribute ("user") User newUser) {
        model.addAttribute("user", newUser);
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/main")
    public String create(@ModelAttribute ("user") User newUser) {
        service.save(newUser);
        return "redirect:/";
    }
}