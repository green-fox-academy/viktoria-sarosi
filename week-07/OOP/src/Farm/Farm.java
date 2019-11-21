package Farm;

import Animal.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Farm {
    //Reuse your Animal class
    //Create a Farm class
    //it has list of Animals
    //it has slots which defines the number of free places for animals
    //breed() -> creates a new animal if there's place for it
    //slaughter() -> removes the least hungry animal
    public ArrayList<Animal> stock;
    int slots;

    public Farm (int slots){
        stock = new ArrayList<>();
        this.slots = 10;
    }
    public void breed(){
        if(slots > stock.size()){
            Animal newAnimal = new Animal();
            stock.add(newAnimal);
            slots--;
        }
        else{
            System.out.println("There is no slot for more animal");
        }
    }

    public void slaughter(){
        HashMap<Animal, Integer> animalsbyhungermap = new HashMap<Animal, Integer>();
        for (int i = 0; i < stock.size() ; i++) {
            animalsbyhungermap.put(stock.get(i), stock.get(i).hunger);
        }
        Animal leasthungry = stock.get(0);
        for (int i = 0; i <stock.size() ; i++) {
            if((stock.get(i).hunger) < leasthungry.hunger){
                leasthungry = stock.get(i);
            }
        }
        stock.remove(leasthungry);
        slots++;
        System.out.println("Just slaughtered one animal, the stock is " + this.stock.size());
        }

    public void add(Animal animal) {
        stock.add(animal);
    }
    // for(Map.Entry<Animal, Integer> entry : animalsbyhungermap.entrySet());
    // Megcsinálni HashMappel is!

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < stock.size(); i++) {
            result += (i+1) + ". " + stock.get(i) + "\n";
        }
        return result;
    }

}

