package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accounts = new ArrayList<>();

    public BankController() {
        accounts.add(new BankAccount("Simba", 2000, "lion"));
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", accounts);
        return "index";
    }

    @GetMapping("/ception")
    public String htmlception(Model model){
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "ception";
    }
}
