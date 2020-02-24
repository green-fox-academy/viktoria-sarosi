package com.greenfoxacademy.programmerfox.models;

import java.util.ArrayList;

public class Fox {

    String name;
    ArrayList<String> listOfTrics;
    String food;
    String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListOfTrics() {
        return listOfTrics;
    }

    public void setListOfTrics(ArrayList<String> listOfTrics) {
        this.listOfTrics = listOfTrics;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
