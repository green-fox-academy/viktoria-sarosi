package Stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_10_OOP_Main {
    public static void main(String[] args) {
        ArrayList<Fox> foxPack = new ArrayList<>();
        foxPack.add(new Fox("Vuk", "green", 2));
        foxPack.add(new Fox("Csele", "green", 3));
        foxPack.add(new Fox("Miri", "red", 6));
        foxPack.add(new Fox("Dovid", "red", 1));
        foxPack.add(new Fox("Lala", "green", 7));
        foxPack.add(new Fox("Papa", "brown", 8));

        foxPack.stream()
                .filter(f -> f.getColor() == "green")
                .forEach(f -> System.out.println(f.getName()));

        System.out.println();

        foxPack.stream()
                .filter(f -> f.getColor() == "green")
                .filter(f -> f.getAge() < 5)
                .forEach(f -> System.out.println(f.getName()));

        System.out.println();

        Map<String, Long> colorFrequency = foxPack.stream()
                .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting()));
        System.out.println(colorFrequency);
    }
}

