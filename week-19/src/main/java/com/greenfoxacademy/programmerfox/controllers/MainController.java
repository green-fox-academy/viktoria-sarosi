package com.greenfoxacademy.programmerfox.controllers;

import com.greenfoxacademy.programmerfox.models.Fox;
import com.greenfoxacademy.programmerfox.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(name = "name", required = false) String name) {
        model.addAttribute("fox", foxService.find(name));
        model.addAttribute("active", "index");
        return "index";
    }

    @GetMapping("/login")
    public String renderLogin(Model model, @RequestParam(name = "name", required = false) String name) {
        model.addAttribute("active", "login");
        return "login";
    }

    @PostMapping("/login")
    public String login(String name) {
        foxService.add(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/information")
    public String renderInfo(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("fox", foxService.find(name));
        model.addAttribute("active", "information");
        if (foxService.find(name).getFoodAmount() > 0) {
            foxService.decreaseFood(foxService.find(name));
        }
        if (foxService.find(name).getDrinkAmount() > 0) {
            foxService.decreaseDrink(foxService.find(name));
        }
        return "information";
    }
}
