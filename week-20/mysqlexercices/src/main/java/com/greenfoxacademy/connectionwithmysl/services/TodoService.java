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

    public List<Todo> findAllTodos() {
        return (List<Todo>) todoRepository.findAll();
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

   /* public void editTodoById(long id, boolean newDone, boolean newUrgent) {
        Todo todoToEdit = findTodoById(id);
        todoToEdit.setDone(newDone);
        todoToEdit.setUrgent(newUrgent);
    }*/

    public Todo findTodoById(long id) {
        if (todoRepository.findById(id).isPresent()) {
            return todoRepository.findById(id).get();
        } else {
            return null;
        }
    }
}


