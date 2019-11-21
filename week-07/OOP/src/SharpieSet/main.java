package SharpieSet;

import Sharpie.Sharpie;

public class main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("green", 10.0f);
        Sharpie sharpie2 = new Sharpie("red", 10.0f);
        Sharpie sharpie3 = new Sharpie("blue", 10.0f);

        SharpieSet pencilecase = new SharpieSet();
        pencilecase.add(sharpie1);
        pencilecase.add(sharpie2);
        pencilecase.add(sharpie3);

        pencilecase.countUsable();
        pencilecase.removeTrash();

        for (int i = 0; i < 100; i++) {
            sharpie1.use();
        }
        pencilecase.countUsable();
        System.out.println(pencilecase);
    }
}
