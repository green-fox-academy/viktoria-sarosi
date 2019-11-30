package Domino;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        System.out.println(dominoes);

        List<Domino> dominoesInOrder = new ArrayList<Domino>();
        dominoesInOrder.add(dominoes.get(0));
        dominoes.remove(0);
        while (dominoes.size() > 0) {
            for (int i = 0; i < dominoes.size(); i++) {
                if (dominoes.get(i).getLeftSide() == dominoesInOrder.get(dominoesInOrder.size() - 1).getRightSide()) {
                    dominoesInOrder.add(dominoes.get(i));
                    dominoes.remove(i);
                }
            }
        }
        System.out.println(dominoesInOrder);

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
