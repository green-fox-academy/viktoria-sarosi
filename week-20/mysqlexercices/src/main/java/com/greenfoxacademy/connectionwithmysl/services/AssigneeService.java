package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.Assignee;
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
        assigneeRepository.deleteById(id);
    }

    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public Assignee findAssigneeById(long id) {
        if(assigneeRepository.findById(id).isPresent()){
            return assigneeRepository.findById(id).get();
        }else{
            return null;
        }
    }
}
