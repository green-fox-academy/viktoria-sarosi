import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args){
        Path filepath = Paths.get("duplicated-chars.txt");
        removeDuplicate(filepath);
    }

    private static void removeDuplicate(Path filepath) {
        try {
            List<String> lines = Files.readAllLines(filepath);
            String correct = "";
            for (String line : lines){
                for (int i = 0; i < line.length(); i+=2) {
                    correct += line.charAt(i);
                }
                correct += "\n";
            }
            System.out.println(correct);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
