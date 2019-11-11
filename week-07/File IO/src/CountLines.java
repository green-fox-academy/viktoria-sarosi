import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        Path filepath =  Paths.get("my-files.txt");
        counttheLines(filepath);
    }

    private static void counttheLines(Path filepath) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filepath);
            System.out.println(lines.size());
        } catch (IOException e) {
            System.out.println("0");
        }

    }
}
