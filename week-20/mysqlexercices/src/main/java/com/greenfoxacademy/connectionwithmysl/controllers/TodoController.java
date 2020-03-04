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
    public String renderList(Model model, @RequestParam(name = "isActive", required = false) String isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.findAllTodos());
        } else {
            model.addAttribute("todos", todoService.findAllTodosByIsDone(isActive));
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String renderAdd() {
        return "/add";
    }

    @PostMapping("/add")
    public String saveNewTodo(String title) {
        todoService.saveNewTodo(title);
        return "redirect:list";
    }

    @PostMapping(value = "/{id}/delete")
    public String deleteTodoById(@PathVariable (value = "id", required = false) long id){
        todoService.deleteTodoById(id);
        return "redirect:/todo/list";
    }

    @GetMapping({"/{id}/edit"})
    public String renderEdit(@PathVariable (value = "id", required = false) long id, Model model){
        model.addAttribute("todo", todoService.findTodoById(id));
        return "edit";
    }

    @PostMapping({"/{id}/edit"})
    public String editTodoById(Model model, @ModelAttribute (name= "todo") Todo todo,  @PathVariable (value = "id", required = false)  long id){
        todoService.editTodoById(id);
        return "redirect:/todo/list";
    }
}

