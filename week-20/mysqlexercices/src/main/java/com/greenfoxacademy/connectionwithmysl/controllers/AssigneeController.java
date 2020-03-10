package com.greenfoxacademy.connectionwithmysl.controllers;

import com.greenfoxacademy.connectionwithmysl.models.Assignee;
import com.greenfoxacademy.connectionwithmysl.models.Todo;
import com.greenfoxacademy.connectionwithmysl.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysl.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping
    public String renderListOfAssignees(Model model) {
        model.addAttribute("assigneeslist", assigneeService.findAllAssignees());
        return "assignees";
    }

    @GetMapping(value = "/{id}/delete")
    public String deleteAssigneeById(@PathVariable(value = "id", required = false) long id) {
        assigneeService.deleteAssigneeById(id);
        return "redirect:/assignees";
    }

    @GetMapping("/add-assignee")
    public String renderAdd(Model model, @ModelAttribute("assignee") Assignee assignee) {
        model.addAttribute("assignee", assignee);
        return "add-assignee";
    }

    @PostMapping("/add-assignee")
    public String saveNewAssignee(@ModelAttribute("assignee") Assignee assignee) {
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignees";
    }

    @GetMapping({"/{id}/edit-assignee"})
    public String renderEdit(@PathVariable(value = "id", required = false) long id, Model
            model, @ModelAttribute("assignee") Assignee assignee) {
        model.addAttribute("assignee", assigneeService.findAssigneeById(id));
        return "edit-assignee";
    }

    @PostMapping({"/{id}/edit-assignee"})
    public String editTodoById(@ModelAttribute("assignee") Assignee assignee) {
        assigneeService.saveAssignee(assignee);
        return "redirect:/assignees";
    }
}
