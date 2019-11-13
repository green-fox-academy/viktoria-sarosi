import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        Path filepath = Paths.get("reversedtext.txt");
        reversethetext(filepath);
    }

    private static void reversethetext(Path filepath) {
        try {
            List<String> stillreversed = Files.readAllLines(filepath);
            String correct = "";
            for (String line : stillreversed){
                for (int i = line.length()-1; i > 0 ; i--) {
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
