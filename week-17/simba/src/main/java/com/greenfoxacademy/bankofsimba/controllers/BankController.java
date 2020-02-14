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
        accounts.add(new BankAccount("Nala", 2000, "lion"));
        accounts.add(new BankAccount("Timon", 1850, "meercat"));
        accounts.add(new BankAccount("Pumba", 1900, "warthog"));
        accounts.add(new BankAccount("Scar", 1910, "lion"));
        accounts.add(new BankAccount("Sarabi", 1870, "lion"));
        accounts.add(new BankAccount("Zazu", 1790, "hornbill"));
        accounts.add(new BankAccount("Shenzi", 1800, "hyena"));
        accounts.add(new BankAccount("Ed", 1870, "hyena"));

    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", accounts.get(0));
        return "index";
    }

    @GetMapping("/ception")
    public String htmlception(Model model){
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "ception";
    }

    @GetMapping("/showAllAccounts")
    public String ShowAllAccounts(Model model){
        model.addAttribute("accounts", accounts);
        return "showAllAccounts";
    }
}
