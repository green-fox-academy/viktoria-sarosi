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
    private List<String> tricks;

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
        tricks = new ArrayList<>();
        tricks.add("Learn Java");
        tricks.add("Cook dinner ");
        tricks.add("Card tricks");
        tricks.add("Speak Hungarian");
        tricks.add("Sing");

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

    public List<String> getTricks() {
        return tricks;
    }

    public void add(String name) {
        if (find(name) == null) {
            foxPack.add(new Fox(name));
        }
    }

    public Fox find(String name) {
        for (int i = 0; i < foxPack.size(); i++) {
            if (foxPack.get(i).getName().equalsIgnoreCase(name)) {
                return foxPack.get(i);
            }
        }
        return null;
    }

    public void addFoodAndDrink(String food, String drink, Fox fox) {
        fox.setFood(food);
        fox.setDrink(drink);
    }

    public void addNewTrick(String trick, Fox fox) {
        fox.setListOfTricks(trick);
    }

    public void removeLearnedTrick(String trick) {
        getTricks().remove(trick);
    }
}
