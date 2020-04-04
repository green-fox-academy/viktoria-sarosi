package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.entities.Assignee;
import com.greenfoxacademy.connectionwithmysl.models.entities.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssigneeService {
    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public List<Assignee> findAllAssignees() {
        return (List<Assignee>) assigneeRepository.findAll();
    }

    public void deleteAssigneeById(long id) {
        Optional<Assignee> optionalAssignee = assigneeRepository.findById(id);
        if (optionalAssignee.isPresent()) {
            if (optionalAssignee.get().getTodos().isEmpty()) {
                assigneeRepository.deleteById(id);
            } else {
                for (int i = 0; i < optionalAssignee.get().getTodos().size(); i++) {
                    optionalAssignee.get().getTodos().get(i).setAssignee(null);
                }
                assigneeRepository.deleteById(id);
            }
        }
    }

    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee findAssigneeById(long id) {
        Optional<Assignee> optionalAssignee = assigneeRepository.findById(id);
        return optionalAssignee.orElse(null);
    }

    public void addTodo(Todo todo, String assigneeName) {
        assigneeRepository.findByName(assigneeName).setTodos(todo);
    }

    public Assignee findAssigneeByName(String name) {
        return assigneeRepository.findByName(name);
    }
}
