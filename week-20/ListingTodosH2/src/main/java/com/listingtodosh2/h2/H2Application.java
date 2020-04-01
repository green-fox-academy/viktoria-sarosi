package com.listingtodosh2.h2;

import com.listingtodosh2.h2.models.Todo;
import com.listingtodosh2.h2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public H2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo("Learn ORM");
        todoRepository.save(todo);
        Todo otherTodo = new Todo("Finish excercise");
        todoRepository.save(otherTodo);
    }
}
