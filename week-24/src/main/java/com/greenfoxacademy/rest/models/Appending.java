package com.greenfoxacademy.rest.models;

public class Appending {

    private String appended;

    public Appending() {
    }

    public Appending(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
