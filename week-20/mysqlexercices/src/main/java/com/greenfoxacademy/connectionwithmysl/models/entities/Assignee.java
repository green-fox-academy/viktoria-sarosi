package com.greenfoxacademy.connectionwithmysl.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "assignee", fetch = FetchType.EAGER) /* ha itt van cascad, akkor ha töröljük az assigneet, törlődnek a todoi is, és igy a delete Assignee By Id function lehet csak egy repo hivas delete-re*/
    private List<Todo> todos;

    public Assignee(String name) {
        todos = new ArrayList<>();
        this.name = name;
    }

    public Assignee() {
        todos = new ArrayList<>();
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(Todo todo) {
        todos.add(todo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
