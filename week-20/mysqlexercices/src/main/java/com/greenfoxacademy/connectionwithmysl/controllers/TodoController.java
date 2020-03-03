package com.greenfoxacademy.connectionwithmysl.controllers;

import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {
            boolean activeBoolean = (isActive.equalsIgnoreCase("false"));
            model.addAttribute("todos", todoRepository.findAllByIsDone(activeBoolean));
        }
        return "todolist";
    }
}

