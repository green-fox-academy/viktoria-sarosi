package com.greenfoxacademy.rest.models.entities;

public class Doubled {
    private int received;
    private int result;

    public Doubled() {
    }

    public Doubled(Integer received) {
        this.received = received;
        result = 2 * received;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
