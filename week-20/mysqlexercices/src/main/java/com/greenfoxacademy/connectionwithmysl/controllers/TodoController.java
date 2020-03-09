package com.greenfoxacademy.connectionwithmysl.controllers;

import com.greenfoxacademy.connectionwithmysl.models.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysl.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String renderList(Model model, @RequestParam(name = "isActive", required = false) String isActive, @RequestParam(name = "fragment", required = false) String fragment) {

        if (isActive == null) {
            model.addAttribute("todos", todoService.findAllTodos());
        } else {
            model.addAttribute("todos", todoService.findAllTodosByIsDone(isActive));
        }
        if (fragment != null) {
            if (todoService.findTodosByTitleFragment(fragment) != null) {
                model.addAttribute("todosByTitle", todoService.findTodosByTitleFragment(fragment));
            } else{
                model.addAttribute("no", "No Such Todo in Today's Todo List");
            }
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String renderAdd(Model model, @ModelAttribute("todo") Todo todo) {
        model.addAttribute("todo", todo);
        return "/add";
    }

    @PostMapping("/add")
    public String saveNewTodo(@ModelAttribute("todo") Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:list";
    }

    @PostMapping(value = "/{id}/delete")
    public String deleteTodoById(@PathVariable(value = "id", required = false) long id) {
        todoService.deleteTodoById(id);
        return "redirect:/todo/list";
    }

    @GetMapping({"/{id}/edit"})
    public String renderEdit(@PathVariable(value = "id", required = false) long id, Model
            model, @ModelAttribute("todo") Todo todo) {
        model.addAttribute("todo", todoService.findTodoById(id));
        return "edit";
    }

    @PostMapping({"/{id}/edit"})
    public String editTodoById(@ModelAttribute("todo") Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/todo/list";
    }

}

