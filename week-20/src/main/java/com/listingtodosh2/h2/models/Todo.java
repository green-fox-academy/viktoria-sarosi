package com.listingtodosh2.h2.models;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        urgent = false;
        done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
