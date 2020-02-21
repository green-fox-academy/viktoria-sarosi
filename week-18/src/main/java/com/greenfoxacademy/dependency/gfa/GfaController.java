package com.greenfoxacademy.dependency.gfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GfaController {

    StudentService studentService;

    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String renderGfaMain() {
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String renderList(Model model) {
        model.addAttribute("list", studentService.findAll());
        return "gfa/list";
    }

    @PostMapping("gfa/add")
    public String addNewStudent(String name) {
        studentService.save(name);
        return "gfa/add";
    }

    @GetMapping("gfa/add")
    public String renderAdd(Model model) {
        model.addAttribute("name", "name");
        return "gfa/add";
    }
}