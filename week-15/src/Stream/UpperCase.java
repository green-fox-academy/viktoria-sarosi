package Stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isUpperCase;

public class UpperCase {
    public static void main(String[] args) {
        String input = "Who Is The Boss?";
        input.chars()
                .filter(c -> isUpperCase(c))
                .forEach(c -> System.out.println((char) c));

        List<Character> result = input.chars()
                .filter(c -> isUpperCase(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println(result);



    }
}
