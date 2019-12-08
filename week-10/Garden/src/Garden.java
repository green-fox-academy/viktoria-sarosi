import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<Plant>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void waterTheGarden(int waterAmount) {
        System.out.println("Watering with " + waterAmount + ".");
        System.out.println();
        int counter = 0;
        ArrayList<Plant> toBeWatered = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
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
            if (plants.get(i).needsWater()) {
                System.out.println("The " + plants.get(i).getColor() + " " + plants.get(i).getClass().getSimpleName().toLowerCase() + " needs water.");
            } else {
                System.out.println("The " + plants.get(i).getColor() + " " + plants.get(i).getClass().getSimpleName().toLowerCase() + " doesn't need water.");
            }
        }
        System.out.println();
    }
}
