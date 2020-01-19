package Pirates;

import java.util.ArrayList;

public class BattleAppMainPirates {
    public static void main(String[] args) {

        Ship s1 = new Ship();
        s1.name = "Victory";
        Ship s2 = new Ship();
        s2.name = "Queen";

        s1.fillShip();
        s2.fillShip();
        System.out.println(s1);
        System.out.println(s2);

        s1.captain.drinkSomeRum();
        s1.captain.drinkSomeRum();
        s1.captain.drinkSomeRum();
        System.out.println(s1);
        s1.battle(s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}
