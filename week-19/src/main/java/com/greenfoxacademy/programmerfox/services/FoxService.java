package com.greenfoxacademy.programmerfox.services;

import com.greenfoxacademy.programmerfox.models.Fox;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxPack;
    private List<String> foods;
    private List<String> drinks;
    private List<String> tricks;
    private String formatDateTime;
    private LocalDateTime now;
    DateTimeFormatter format;

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
        tricks.add("code in Java");
        tricks.add("cook dinner ");
        tricks.add("do card tricks");
        tricks.add("speak Hungarian");
        tricks.add("sing");
        now = LocalDateTime.now();
        format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formatDateTime = now.format(format);
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

    public void addFood(String food, Fox fox) {
        fox.setActions(formatDateTime + " Food has been changed from " + fox.getFood() + " to " + food);
        fox.setFood(food);
    }

    public void addDrink(String drink, Fox fox) {
        fox.setActions(formatDateTime + " Drink has been changed from " + fox.getDrink() + " to " + drink);
        fox.setDrink(drink);
    }

    public void addNewTrick(String trick, Fox fox) {
        fox.setListOfTricks(trick);
        fox.setActions(formatDateTime + " Learned to " + trick);
    }

    public void removeLearnedTrick(String trick) {
        getTricks().remove(trick);
    }

    public void addAction(String action, Fox fox) {
        fox.setActions(action);
    }
}
