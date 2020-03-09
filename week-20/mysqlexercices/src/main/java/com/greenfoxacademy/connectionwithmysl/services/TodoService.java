package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.Assignee;
import com.greenfoxacademy.connectionwithmysl.models.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public List<Todo> findAllTodos() {
        return (List<Todo>) todoRepository.findAllByOrderByIdAsc();
    }

    public List<Todo> findAllTodosByIsDone(String isActive) {
        Boolean activeBoolean = (isActive.equalsIgnoreCase("false"));
        return (List<Todo>) todoRepository.findAllByIsDone(activeBoolean);
    }

    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodoById(long id) {
        todoRepository.deleteById(id);
    }

    public Todo findTodoById(long id) {
        if (todoRepository.findById(id).isPresent()) {
            return todoRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public List<Todo> findTodosByTitleFragment(String titleFragment) {
        return (List<Todo>) todoRepository.findAllByTitleContaining(titleFragment);
    }

    public List<Assignee> findAllAssignees() {
        return (List<Assignee>) assigneeRepository.findAll();
    }
}



