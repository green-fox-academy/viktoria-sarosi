package com.greenfoxacademy.programmerfox;

import com.greenfoxacademy.programmerfox.models.Fox;
import com.greenfoxacademy.programmerfox.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("fox",  foxService.find(name));
        return "index";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("login")
    public String login(Model model, String name) {
        foxService.add(new Fox("name"));

        return "redirect:/?name=" + name;
    }

    @GetMapping("information")
    public String renderInfo(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("fox", foxService.find(name));
        return "information";
    }
}
