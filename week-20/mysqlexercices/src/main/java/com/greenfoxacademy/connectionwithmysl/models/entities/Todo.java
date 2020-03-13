package com.greenfoxacademy.connectionwithmysl.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    @ManyToOne
    private Assignee assignee;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date due;

    public Todo() {
        creation = new Date();
}

    public Todo(String title) {
        this.title = title;
        isUrgent = false;
        isDone = false;
        creation = new Date();
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public Todo(String title, boolean isUrgent, boolean isDone, Assignee assignee, Date due) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.assignee = assignee;
        this.due = new Date();
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getCreation() {
        return creation;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
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

    public boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public boolean getDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public long getAssigneeId() {
        if (this.getAssignee() == null) {
            return 0L;
        }
        return this.getAssignee().getId();
    }


}

