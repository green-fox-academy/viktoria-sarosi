package com.greenfoxacademy.rest.models.dtos;

import com.greenfoxacademy.rest.models.entities.Result;

public class ArrayHandler {

    private String what;
    private int[] numbers;

    public ArrayHandler() {
    }

    public ArrayHandler(String what) {
        this.what = what;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    public Result sumElements() {
        Integer tempResult = 0;
        Result result = new Result();
        for (int i = 0; i < this.getNumbers().length - 1; i++) {
            tempResult += this.getNumbers()[i];
            result.setResult(tempResult);
        }
        return result;
    }

    public Result multiplyElements(){
        Integer tempResult = 1;
        Result result = new Result();
        for (int i = 0; i < this.getNumbers().length - 1; i++) {
            tempResult *= this.getNumbers()[i];
            result.setResult(tempResult);
        }
        return result;
    }
}
