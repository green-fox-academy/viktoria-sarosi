import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonCharacters {
    public static void main(String[] args) {
        //Write a function that takes a filename as a parameter. Return the 2 most common characters and their occurrences in the file's content.
        //
        //If the file does not exist throw an exception with the following message: "File does not exist!"
        //
        //Example
        //
        //Example file can be found here
        //
        //Output
        //
        //{
        //  "e": 6,
        //  "l": 4
        //}
        Path filename = Paths.get("myfile.txt");
        mostCommonChar(filename);

    }

    private static void mostCommonChar(Path filename) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filename);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }

        String together = "";
        for (int i = 0; i < lines.size(); i++) {
            together += lines.get(i);
        }

        String[] chars = together.split("");
        HashMap<String, Integer> counted = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!counted.containsKey(chars[i])) {
                counted.put(chars[i], 1);
            } else {
                counted.replace(chars[i], counted.get(chars[i]) + 1);
            }
        }
        String tempString = "";
        Integer tempInteger = 0;
        for (int i = 0; i < 2; i++) {
            for (Map.Entry<String, Integer> entry : counted.entrySet()) {
                if (entry.getValue() == Collections.max(counted.values())) {
                    tempString = entry.getKey();
                    tempInteger = entry.getValue();
                    break;
                }
            }
            counted.remove(tempString, tempInteger);
            System.out.println(tempString + " : " + tempInteger);

        }

    }
}
