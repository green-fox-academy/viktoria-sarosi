package com.greenfoxacademy.programmerfox.models;

import java.util.ArrayList;

public class Fox {

    private String name;
    private ArrayList<String> listOfTricks;
    private String food;
    private String drink;
    private boolean isHungry;

    public Fox() {
        listOfTricks = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(String trick) {
        listOfTricks.add(trick);
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
