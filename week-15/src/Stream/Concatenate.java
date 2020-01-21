package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate {
    public static void main(String[] args) {
        List<Character> input = Arrays.asList('a', 'b', 'l', 'a', 'k');
        String result = input.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining());
        System.out.println(result);


    }
}
