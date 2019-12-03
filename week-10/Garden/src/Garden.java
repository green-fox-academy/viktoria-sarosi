import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;
    //private ArrayList<Tree> trees;

    public Garden() {
        this.plants = new ArrayList<Plant>();
        //this.trees = new ArrayList<Tree>();
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void waterTheGarden(int waterAmount) {
        int counter = 0;
        ArrayList<Plant> toBeWatered = new ArrayList<Plant>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i) instanceof Flower && plants.get(i).getCurrentWaterLevel()<5) {
                counter++;
                toBeWatered.add(plants.get(i));
            }else if(plants.get(i) instanceof Tree && plants.get(i).getCurrentWaterLevel() < 10){
                counter++;
                toBeWatered.add(plants.get(i));
            }
        }
        int dividedwaterAmount = waterAmount / counter;
        for (int i = 0; i < toBeWatered.size(); i++) {
            toBeWatered.get(i).setCurrentWaterLevel(toBeWatered.get(i).getCurrentWaterLevel() + dividedwaterAmount * toBeWatered.get(i).getAbsorption());
        }

    }
}
