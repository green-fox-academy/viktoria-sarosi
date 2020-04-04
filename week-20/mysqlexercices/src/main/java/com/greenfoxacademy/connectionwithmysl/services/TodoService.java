package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.entities.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional <Todo> optionalTodo = todoRepository.findById(id);
        return optionalTodo.orElse(null);
    }

    public List<Todo> findTodosByTitleFragment(String titleFragment, String isActive) {
        if (isActive == null) {
            return (List<Todo>) todoRepository.findAllByTitleContaining(titleFragment);
        } else {
            return (List<Todo>) todoRepository.findAllByTitleContainingAndIsDone(titleFragment, isActive);
        }

    }

    public void setNewAssignee(Todo todo, String assigneeName) {
        todo.setAssignee(assigneeRepository.findByName(assigneeName));
    }


    public List<Todo> findTodosByAssigneeFragment(String input, String isActive) {
        if (isActive == null) {
            return (List<Todo>) todoRepository.findAllByAssigneeContaining(input);
        } else {
            return (List<Todo>) todoRepository.findAllByAssigneeContainingAndIsDone(input, isActive);
        }

    }

    public void editTodoById(long id, Todo todo, String assigneeName){
        todo.setCreation(findTodoById(id).getCreation());
        setNewAssignee(todo, assigneeName);
        saveTodo(todo);
    }
}




