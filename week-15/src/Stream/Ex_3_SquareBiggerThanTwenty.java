package Stream;

import java.util.Arrays;
import java.util.List;

public class Ex_3_SquareBiggerThanTwenty {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .map(n -> Math.pow(n, 2))
                .filter(n -> n > 20)
                .forEach(System.out:: println);
    }
}
