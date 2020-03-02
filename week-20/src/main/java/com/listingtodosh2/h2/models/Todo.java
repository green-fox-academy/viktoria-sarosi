package com.listingtodosh2.h2.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo() {
        urgent = false;
        done = false;
    }
}
