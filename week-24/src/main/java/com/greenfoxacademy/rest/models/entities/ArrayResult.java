package com.greenfoxacademy.rest.models.entities;

public class ArrayResult {
    private int[] result;

    public ArrayResult() {
    }

    public ArrayResult(int[] result) {
        this.result = result;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}
