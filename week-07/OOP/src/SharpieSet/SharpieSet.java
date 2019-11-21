package SharpieSet;

import Sharpie.Sharpie;

import java.util.ArrayList;

public class SharpieSet {
    public ArrayList<Sharpie> sharpies;

    public SharpieSet() {
        sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public void countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public ArrayList removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
                i--; // kitörli, ezért előreugranak a mögötte lévők, igy nem hagyja ki a következőt
            }
        }
        return sharpies;
    }
    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < sharpies.size(); i++) {
            result += (i+1) + ". " + sharpies.get(i) + "\n";
        }
        return result;
    }
}
