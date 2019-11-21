package Farm;

import Animal.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cow1 = new Animal();
        Animal cow2 = new Animal();
        Animal cow3 = new Animal();
        Animal cow4 = new Animal();

        cow1.eat();
        cow1.eat();
        cow2.play();
        cow3.play();
        cow3.play();

        Farm Ewing = new Farm(10);
        Ewing.add(cow1);
        Ewing.add(cow2);
        Ewing.add(cow3);
        Ewing.add(cow4);

        Ewing.breed();
        Ewing.breed();
        Ewing.breed();
        Ewing.slaughter();
    }
}
