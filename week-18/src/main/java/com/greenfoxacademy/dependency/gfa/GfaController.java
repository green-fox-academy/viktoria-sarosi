package com.greenfoxacademy.dependency.gfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class GfaController {

    StudentService studentService;

    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String renderGfaMain(Model model) {
        model.addAttribute("count", studentService.count(studentService.findAll()));
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String renderList(Model model) {
        model.addAttribute("list", studentService.findAll());
        return "gfa/list";
    }

    @PostMapping("gfa/save")
    public String addNewStudent(String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("gfa/add")
    public String renderAdd(Model model) {
        model.addAttribute("name", "name");
        return "gfa/add";
    }

    @GetMapping("gfa/check")
    public String renderStudentChecker(Model model) {
        return "gfa/check";
    }

    @PostMapping("gfa/check")
    public String checkStudent(String name, Model model) {
        model.addAttribute("studentornot", studentService.check(name, studentService.findAll()));
        return "gfa/check";
    }

}