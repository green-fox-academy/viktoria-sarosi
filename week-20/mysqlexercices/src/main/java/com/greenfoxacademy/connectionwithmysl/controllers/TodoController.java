package com.greenfoxacademy.connectionwithmysl.controllers;

import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysl.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.findAllTodos());
        } else {
            model.addAttribute("todos", todoService.findAllTodosByIsDone(isActive));
        }
        return "todolist";
    }
}

