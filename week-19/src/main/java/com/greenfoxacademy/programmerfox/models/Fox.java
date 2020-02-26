package com.greenfoxacademy.programmerfox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private ArrayList<String> listOfTricks;
    private String food;
    private String drink;
    private List<String> actions;

    public Fox() {
        listOfTricks = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
        actions = new ArrayList<>();
        this.food = "apple";
        this.drink = "hot chocolate";
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

    public List<String> getActions() {
        return actions;
    }

    public void setActions(String action) {
        this.getActions().add(action);
    }
}
