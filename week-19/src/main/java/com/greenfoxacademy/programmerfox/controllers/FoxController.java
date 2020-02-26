package com.greenfoxacademy.programmerfox.controllers;

import com.greenfoxacademy.programmerfox.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutrition-store")
    public String renderNutritionStore(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("drinks", foxService.getDrinks());
        model.addAttribute("foods", foxService.getFoods());
        model.addAttribute("fox", foxService.find(name));
        return "nutrition-store";
    }

    @PostMapping("nutrition-store")
    public String selectFoodAndDrink(  String food, String drink, @RequestParam(name = "name", required = true) String name) {
        foxService.addFood(food, foxService.find(name));
        foxService.addDrink(drink, foxService.find(name));
        return "redirect:/information?name=" + name;
    }


    @GetMapping("/trick-center")
    public String renderTrickCenter(Model model, @RequestParam(name = "name", required = true) String name) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", foxService.getTricks());
        model.addAttribute("fox", foxService.find(name));
        if(foxService.getTricks().size() == 0) {
            return "congratulations";
        }
        else{
            return "trick-center";
        }

    }

    @PostMapping("/trick-center")
    public String learnTrick(@RequestParam(name = "name", required = true) String name, String trick) {
        foxService.addNewTrick(trick, foxService.find(name));
        foxService.removeLearnedTrick(trick);
        return "redirect:/information?name=" + name;
    }

    @GetMapping("/congratulations")
    public String renderCongratulations(Model model, @RequestParam(name = "name", required = true) String name){
        model.addAttribute("fox", foxService.find(name));
        return "congratulations";
    }

    @GetMapping("/action-history")
    public String renderActionHistory(Model model, @RequestParam(name = "name", required = true) String name ){
        model.addAttribute("fox", foxService.find(name));
        return "action-history";
    }
}
