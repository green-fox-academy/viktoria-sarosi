package FishTank;

import java.util.ArrayList;

public class Aquarium {
    private ArrayList<Fish> listOfFish;

    public Aquarium() {
        this.listOfFish = new ArrayList<>();
    }

    public void addFish(Fish fish){
        this.listOfFish.add(fish);
    }

    public void feedAllTheFish() {
        for (Fish fish : listOfFish) {
            fish.feed();
        }
    }

    public void removeFish() {
        for (int i = 0; i < listOfFish.size(); i++) {
            if (listOfFish.get(i).getWeight() >= 11) {
                listOfFish.remove(i);
            }
        }
    }

    public void getStatus() {
        for (Fish fish : listOfFish) {
            fish.status();
        }
    }
}
