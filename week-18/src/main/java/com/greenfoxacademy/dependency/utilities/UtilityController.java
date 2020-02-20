package com.greenfoxacademy.dependency.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UtilityController {

    UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping(path = "/useful", method = RequestMethod.GET)
    public String showLinks() {
        return "/useful";
    }

    @GetMapping("/useful/color")
    public String renderColor(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "/useful/color";
    }

}
