package com.greenfoxacademy.dependency.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String renderColor(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "/useful/color";
    }

    @GetMapping("/useful/email")
    public String renderEmailValidator(Model model, @RequestParam(name = "email", required = false) String emailToValidate) {
        if (utilityService.isValid(emailToValidate)) {
            model.addAttribute("email", emailToValidate + "is a valid email address");
            model.addAttribute("color", "green");
        } else {
            model.addAttribute("email", emailToValidate + "is not a valid email address");
            model.addAttribute("color", "red");
        }
        return "useful/email";
    }

    @GetMapping("/useful/encoder")
    public String encodeText(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "number") Integer number) {
        model.addAttribute("encoded", utilityService.caesar(text, number));
        return "useful/encode";
    }

    @GetMapping("/useful/decode")
    public String decodeText(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "number") Integer number) {
        model.addAttribute("decoded", utilityService.caesar(text, -number));
        return "useful/decode";
    }
}
