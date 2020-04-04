package com.greenfoxacademy.connectionwithmysl.controllers;

import com.greenfoxacademy.connectionwithmysl.models.entities.Assignee;
import com.greenfoxacademy.connectionwithmysl.models.entities.Todo;
import com.greenfoxacademy.connectionwithmysl.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysl.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String renderList(Model model, @RequestParam(name = "isActive", required = false) String isActive, @RequestParam(name = "input", required = false) String input, @RequestParam(name = "category", required = false) String category) {

        if (isActive == null && input == null) {
            model.addAttribute("todos", todoService.findAllTodos());
        } else if (isActive != null && input == null) {
            model.addAttribute("todos", todoService.findAllTodosByIsDone(isActive));
        } else {
            if (todoService.findTodosByTitleFragment(input, isActive) != null) {
                if (category.equals("byTitle")) {
                    model.addAttribute("todos", todoService.findTodosByTitleFragment(input, isActive));
                }
                if (category.equals("byAssignee")) {
                    model.addAttribute("todos", todoService.findTodosByAssigneeFragment(input, isActive));
                }
            } else {
                model.addAttribute("no", "No Such Todo in Today's Todo List");
            }
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String renderAdd(Model model, @ModelAttribute("todo") Todo todo) {
        model.addAttribute("todo", todo);
        return "add";
    }

    @PostMapping("/add")
    public String saveNewTodo(@ModelAttribute("todo") Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/delete")
    public String deleteTodoById(@PathVariable(value = "id", required = false) long id) {
        todoService.deleteTodoById(id);
        return "redirect:/todo/list";
    }

    @GetMapping({"/{id}/edit"})
    public String renderEdit(@PathVariable(value = "id", required = false) long id, Model
            model, @ModelAttribute("todo") Todo todo, @ModelAttribute("assignee") Assignee assignee) {
        model.addAttribute("todo", todoService.findTodoById(id));
        model.addAttribute("assigneeslist", assigneeService.findAllAssignees());
        return "edit";
    }

    @PostMapping({"/{id}/edit"})
    public String editTodoById(@PathVariable(value = "id", required = false) long id, @ModelAttribute("todo") Todo todo, String assigneeName) {
        todoService.editTodoById(id, todo, assigneeName);
        assigneeService.addTodo(todo, assigneeName);
        return "redirect:/todo/list";
    }


}

