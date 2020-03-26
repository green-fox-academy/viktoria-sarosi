package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }

    @PostMapping("login")
    public String logUserIn(@ModelAttribute User user) {
        if (userService.logUserIn(user)) {
            return "redirect:/" + user.getId();
        } else {
            return "login";
        }
    }

    @GetMapping("register")
    public String renderRegisterPage() {
        return "register";
    }

    @PostMapping("register")
    public String registerNewUser(@ModelAttribute User user) {
        if (user.getPassword().equals(user.getPassword2())) {
           User registeredUser = userService.register(user);
            return "redirect:/" + registeredUser.getId();
        } else {
            return "register";
        }

    }
}