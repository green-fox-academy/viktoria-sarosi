package com.greenfoxacademy.programmerfox.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    public static final int FOODAMOUNT_MIN_LIMIT = 0;
    public static final int DRINKAMOUNT_MIN_LIMIT = 0;

    private String name;
    private ArrayList<String> listOfTricks;
    private String food;
    private String drink;
    private List<String> actions;
    private Integer foodAmount;
    private Integer drinkAmount;

    public Fox() {
        listOfTricks = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public Integer getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(Integer foodAmount) {
        if (foodAmount < 0) return;
        this.foodAmount = foodAmount;
    }

    public Integer getDrinkAmount() {
        return drinkAmount;
    }

    public void setDrinkAmount(Integer drinkAmount) {
        if (drinkAmount < 0) return;
        this.drinkAmount = drinkAmount;
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

    public List<String> getAllOrLatestFiveActions(){
        if(this.getActions().size() < 5){
            return this.getActions();
        }else {
            List<String> latestFive = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                latestFive.add(this.getActions().get(this.getActions().size() - (5 - i)));
            }
            return latestFive;
        }
    }
}
