package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accounts = new ArrayList<>();

    public BankController() {
        accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        accounts.add(new BankAccount("Nala", 2000, "lion", false, true));
        accounts.add(new BankAccount("Timon", 1850, "meercat", false, true));
        accounts.add(new BankAccount("Scar", 1910, "lion", false, false));
        accounts.add(new BankAccount("Sarabi", 1870, "lion", false, true));
        accounts.add(new BankAccount("Zazu", 1790, "hornbill", false, true));
        accounts.add(new BankAccount("Shenzi", 1800, "hyena", false, false));
        accounts.add(new BankAccount("Ed", 1870, "hyena", false, false));

    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", accounts.get(0));
        return "index";
    }

    @GetMapping("/ception")
    public String htmlception(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "ception";
    }

    @GetMapping("/show-all-accounts")
    public String renderAllAccounts(Model model) {
        model.addAttribute("accounts", accounts);
        return "show-all-accounts";
    }

    @PostMapping("/show-all-accounts")
    public String raiseBalance(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            if (name.equalsIgnoreCase(accounts.get(i).getName())) {
                if (accounts.get(i).isKing()) {
                    accounts.get(i).setBalance(accounts.get(i).getBalance() + 100);
                } else {
                    accounts.get(i).setBalance(accounts.get(i).getBalance() + 10);
                }
            }
        }

        return "redirect:/show-all-accounts";
    }

    @GetMapping("/new-account")
    public String renderAddForm(Model model) {
        return "new-account";
    }

    @PostMapping("/new-account")
    public String addNewAccount(@ModelAttribute BankAccount account) {
        accounts.add(account);
        return "redirect:/show-all-accounts";
    }
}
