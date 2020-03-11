package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.entities.Assignee;
import com.greenfoxacademy.connectionwithmysl.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if (assigneeRepository.findById(id).isPresent()) {
            if (assigneeRepository.findById(id).get().getTodos().isEmpty()) {
                assigneeRepository.deleteById(id);
            } else {
                for (int i = 0; i < assigneeRepository.findById(id).get().getTodos().size(); i++) {
                    assigneeRepository.findById(id).get().getTodos().get(i).setAssignee(null);
                }
                assigneeRepository.deleteById(id);
            }
        }
    }

    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee findAssigneeById(long id) {
        if (assigneeRepository.findById(id).isPresent()) {
            return assigneeRepository.findById(id).get();
        } else {
            return null;
        }
    }
}
