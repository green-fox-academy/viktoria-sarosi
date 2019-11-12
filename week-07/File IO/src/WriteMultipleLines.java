import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Path filepath = Paths.get("my-file.txt");
        String word = "ros";
        int num = 13;

        multipleLinesWriter(filepath, word, num);
    }

    private static void multipleLinesWriter(Path filepath, String word, int num) {
        try {
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < num; i++) {
                lines.add(word);
            }
            Files.write(filepath, lines);
            for (String line: lines) {
                System.out.println(line);
            };
        } catch (IOException e) {
        }
    }
}
