package com.greenfoxacademy.programmerfox.services;

import com.greenfoxacademy.programmerfox.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxPack;
    private List<String> foods;
    private List<String> drinks;

    public FoxService() {
        foxPack = new ArrayList<>();
        foods = new ArrayList<>();
        foods.add("steak");
        foods.add("chicken");
        foods.add("egg");
        drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("milk");
        drinks.add("wine");

    }

    public List<Fox> getFoxPack() {
        return foxPack;
    }

    public List<String> getFoods() {
        return foods;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public void add(Fox fox) {
        foxPack.add(fox);
    }

    public Fox find(String name) {
        for (int i = 0; i < foxPack.size(); i++) {
            if (foxPack.get(i).getName().equalsIgnoreCase(name)) {
                return foxPack.get(i);
            }
        }
        return null;
    }

    public Fox addFoodAndDrink(String food, String drink, Fox fox) {
        fox.setFood(food);
        fox.setDrink(drink);
        return fox;
    }
}
