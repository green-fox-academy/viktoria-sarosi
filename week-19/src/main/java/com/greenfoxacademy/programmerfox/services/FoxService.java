package com.greenfoxacademy.programmerfox.services;

import com.greenfoxacademy.programmerfox.models.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class FoxService {

    private List<Fox> foxPack;
    private List<String> foods;
    private List<String> drinks;
    private List<String> tricks;
    private String formatDateTime;
    private LocalDateTime now;
    private DateTimeFormatter format;
    private final long amountDecreaseSpeed = 10000;

    public FoxService() {
        foxPack = new ArrayList<>();
        foods = new ArrayList<>();
        foods.add("steak");
        foods.add("chicken");
        foods.add("egg");
        foods.add("apple");
        drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("milk");
        drinks.add("wine");
        drinks.add("hot chocolate");
        tricks = new ArrayList<>();
        tricks.add("code in Java");
        tricks.add("cook dinner ");
        tricks.add("do card tricks");
        tricks.add("speak Hungarian");
        tricks.add("sing");
        now = LocalDateTime.now();
        format = DateTimeFormatter.ofPattern("yyyy-MMMM-dd- HH:mm:ss");
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
        if (!food.equalsIgnoreCase(fox.getFood())) {
            fox.setActions(formatDateTime + " Food has been changed from " + fox.getFood() + " to " + food);
            fox.setFood(food);
        }
    }

    public void addDrink(String drink, Fox fox) {
        if (!drink.equalsIgnoreCase(fox.getDrink())) {
            fox.setActions(formatDateTime + " Drink has been changed from " + fox.getDrink() + " to " + drink);
            fox.setDrink(drink);
        }
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

    private static TimerTask foodDecrease(Fox fox) {
        return new TimerTask() {
            @Override
            public void run() {
                fox.setFoodAmount(fox.getFoodAmount() - 1);
            }
        };
    }

    private static TimerTask drinkDecrease(Fox fox) {
        return new TimerTask() {
            @Override
            public void run() {
                fox.setDrinkAmount(fox.getDrinkAmount() - 1);
            }
        };
    }

    public void decreaseFood(Fox fox) {
        if (fox.getFoodAmount() != null && fox.getFoodAmount() > 0) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(foodDecrease(fox), amountDecreaseSpeed, amountDecreaseSpeed);
        }
    }

    public void decreaseDrink(Fox fox) {
        if (fox.getDrinkAmount() != null && fox.getDrinkAmount() > 0) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(drinkDecrease(fox), amountDecreaseSpeed, amountDecreaseSpeed);
        }
    }

}
