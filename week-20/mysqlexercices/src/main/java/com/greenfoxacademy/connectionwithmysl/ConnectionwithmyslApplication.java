package com.greenfoxacademy.connectionwithmysl;

import com.greenfoxacademy.connectionwithmysl.models.Assignee;
import com.greenfoxacademy.connectionwithmysl.models.Todo;
import com.greenfoxacademy.connectionwithmysl.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysl.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmyslApplication implements CommandLineRunner {
    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public ConnectionwithmyslApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionwithmyslApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        /*Todo todo = new Todo("Learn ORM");
        todoRepository.save(todo);
        Todo otherTodo = new Todo("Finish excercise");
        todoRepository.save(otherTodo);
        todoRepository.save(new Todo("Cook dinner", true, false));
        todoRepository.save(new Todo("Get presents", true, false));
        todoRepository.save(new Todo("Get haircut", false, true));
        todoRepository.save(new Todo("Repot the plants"));*/
        assigneeRepository.save(new Assignee("John"));
        assigneeRepository.save(new Assignee("Bob"));
        assigneeRepository.save(new Assignee("Eleanor"));
        assigneeRepository.save(new Assignee("Robert"));
        assigneeRepository.save(new Assignee("Sonia"));

    }


}
