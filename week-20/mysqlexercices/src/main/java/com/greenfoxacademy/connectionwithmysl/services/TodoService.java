package com.greenfoxacademy.connectionwithmysl.services;

import com.greenfoxacademy.connectionwithmysl.models.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAllTodos(){
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> findAllTodosByIsDone(String isActive) {
        Boolean activeBoolean = (isActive.equalsIgnoreCase("false"));
        return (List<Todo>) todoRepository.findAllByIsDone(activeBoolean);
    }

    public void saveNewTodo(String title) {
        todoRepository.save(new Todo(title));
    }

    public void deleteTodoById(long id) {
        todoRepository.deleteById(id);
    }
}


