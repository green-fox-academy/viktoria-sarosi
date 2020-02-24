package com.greenfoxacademy.programmerfox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index( Model model, @RequestParam(name = "name", required = true) String name) {
        return "index";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("login")
    public String login(String name) {
        return "redirect:/?name=" + name;
    }
}
