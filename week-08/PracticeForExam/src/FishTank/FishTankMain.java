package FishTank;

import FishTank.Aquarium;
import FishTank.Clownfish;
import FishTank.Kong;
import FishTank.Tang;

public class FishTankMain {
    public static void main(String[] args) {
        Aquarium bigAquarium = new Aquarium();
        bigAquarium.addFish(new Clownfish("Isabel", 10));
        bigAquarium.addFish(new Clownfish("Betty", 8));
        bigAquarium.addFish(new Tang("Bruce", 10, "Red"));
        bigAquarium.addFish(new Tang("Dezső", 5, "Blue"));
        bigAquarium.addFish(new Kong("Japapa", 6, "Orange"));
        bigAquarium.addFish(new Kong("Keiko", 8, "White"));

        bigAquarium.getStatus();
        System.out.println("-----------Status after feeding once:--------------------");
        bigAquarium.feedAllTheFish();
        bigAquarium.getStatus();
        System.out.println("--------------------Status after removing once:------------------");
        bigAquarium.removeFish();
        bigAquarium.getStatus();

    }
}
