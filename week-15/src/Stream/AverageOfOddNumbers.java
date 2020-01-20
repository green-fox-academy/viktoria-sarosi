package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(n -> n)
                .average();
        System.out.println(average);
        }


    }
