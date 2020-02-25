package com.greenfoxacademy.programmerfox;

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
        return "index";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, String name) {
        foxService.add(new Fox(name));

        return "redirect:/?name=" + name;
    }

    @GetMapping("/information")
    public String renderInfo(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("fox", foxService.find(name));
        return "information";
    }

    @GetMapping("/nutrition-store")
    public String renderNutritionStore(Model model, @RequestParam(name = "name", required = true) String name ) {
        model.addAttribute("drinks", foxService.getDrinks());
        model.addAttribute("foods", foxService.getFoods());
        model.addAttribute("fox", foxService.find(name));
        return "nutrition-store";
    }

    @PostMapping("nutrition-store")
    public String selectFoodAndDrink(Model model, String food, String drink, @RequestParam(name = "name", required = true) String name) {
        foxService.addFoodAndDrink(food, drink, foxService.find(name));
        return "redirect:/information?name=" + name;
    }

    @GetMapping("/trick-center")
    public String renderTrickCenter(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", foxService.getTricks());
        model.addAttribute("fox", foxService.find(name));
        return "trick-center";
    }

    @PostMapping("/trick-center")
    public String learnTrick(Model model, @RequestParam(name = "name", required = true) String name, String trick){
        foxService.addNewTrick(trick, foxService.find(name));
        return "redirect:/information?name=" + name;
    }
}
