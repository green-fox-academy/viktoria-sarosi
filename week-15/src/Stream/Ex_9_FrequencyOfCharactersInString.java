package Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_9_FrequencyOfCharactersInString {
    public static void main(String[] args) {
        String input = "Volt egy török Mehemed";
        Map<Character, Long> frequency = input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
}
