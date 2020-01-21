package Stream;

import java.util.Arrays;
import java.util.List;

public class Ex_7_FindTheStringWithGivenLetter {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String startingChar = "N";
        cities.stream()
                .filter(c -> c.startsWith(startingChar))
                .forEach(c -> System.out.println(c));

    }
}
