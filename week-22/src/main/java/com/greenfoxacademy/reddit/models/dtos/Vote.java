package com.greenfoxacademy.reddit.models.dtos;

public class Vote {
    private long id;
    private long userId;
    private boolean up;

    public Vote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

}
