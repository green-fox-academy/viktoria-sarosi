import java.util.ArrayList;

public class Garden extends Plant {
    private ArrayList<Plant> plants;

    public Garden() {
        super();
        this.plants = new ArrayList<Plant>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void waterTheGarden(int waterAmount) {
        System.out.println("Watering with " + waterAmount + ".");
        System.out.println();
        int counter = 0;
        ArrayList<Plant> toBeWatered = new ArrayList<Plant>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Flower && plants.get(i).getCurrentWaterLevel() < 5) {
                counter++;
                toBeWatered.add(plants.get(i));
            } else if (plants.get(i) instanceof Tree && plants.get(i).getCurrentWaterLevel() < 10) {
                counter++;
                toBeWatered.add(plants.get(i));
            }
        }
        int dividedwaterAmount = waterAmount / counter;
        for (int i = 0; i < toBeWatered.size(); i++) {
            toBeWatered.get(i).setCurrentWaterLevel(toBeWatered.get(i).getCurrentWaterLevel() + dividedwaterAmount * toBeWatered.get(i).getAbsorption());
        }

    }

    public void state() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Tree) {
                if (plants.get(i).getCurrentWaterLevel() < 10) {
                    System.out.println("The " + plants.get(i).getColor() + " tree needs water.");
                } else {
                    System.out.println("The " + plants.get(i).getColor() + " tree doesn't need water.");
                }
            } else if (plants.get(i) instanceof Flower) {
                if (plants.get(i).getCurrentWaterLevel() < 5) {
                    System.out.println("The " + plants.get(i).getColor() + " flower needs water.");
                } else {
                    System.out.println("The " + plants.get(i).getColor() + " flower doesn't need water.");
                }
            }
        }
        System.out.println();
    }
}
