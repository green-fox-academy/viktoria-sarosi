package AnimalShelter;

import java.util.ArrayList;

public class AnimalShelter {
    int budget;
    ArrayList<Animal> animalsList;
    ArrayList<String> adoptersNames;

    public AnimalShelter() {
        budget = 50;
        animalsList = new ArrayList<>();
        adoptersNames = new ArrayList<>();
    }

    public int rescue(Animal animal) {
        animalsList.add(animal);
        return animalsList.size();
    }

    public int heal() {
        for (int i = 0; i < animalsList.size(); i++) {
            if (!animalsList.get(i).isHealthy() && animalsList.get(i).getHealCost() <= budget) {
                animalsList.get(i).setHealthy(true);
                budget -= animalsList.get(i).getHealCost();
                return 1;
            } else {
                continue;
            }
        }
        return 0;
    }

    public void addAdopter(String adopterName) {
        adoptersNames.add(adopterName);
    }

    public void findNewOwner() {
        int randomAdopter = (int) (Math.random() * adoptersNames.size());
        int randomAnimal = (int) (Math.random() * animalsList.size());
        for (int i = 0; i < Math.min(animalsList.size(), animalsList.size()); i++) {
            if (animalsList.get(randomAnimal).isAdaptable()) {
                animalsList.get(randomAnimal).setOwnerName(adoptersNames.get(randomAdopter));
                animalsList.remove(randomAnimal);
                adoptersNames.remove(randomAdopter);
            }
            return;
        }
    }

    public int earnDonation(int donation) {
        budget += donation;
        return budget;
    }

    @Override
    public String toString() {
        String animalsString = "";
        for (int i = 0; i < animalsList.size(); i++) {
            animalsString += animalsList.get(i).toString() + "\n";
        }
        return "Budget: " + budget + " €,\n" + "There are " + animalsList.size() + " animal(s) and " + adoptersNames.size() + " potential adopter(s) \n" + animalsString;
    }
}
