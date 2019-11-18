import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        Path filename = Paths.get("lottery.csv");
        mostCommons(filename);
    }

    private static void mostCommons(Path filename) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> lotterynumberstogether= new ArrayList<>();
        for (int i = 0; i < lines.size() ; i++) {
            String[] lineparts = lines.get(i).split(";");
            lotterynumberstogether.add(lineparts[11]);
            lotterynumberstogether.add(lineparts[12]);
            lotterynumberstogether.add(lineparts[13]);
            lotterynumberstogether.add(lineparts[14]);
            lotterynumberstogether.add(lineparts[15]);
        }
        HashMap<String, Integer> numberscounted = new HashMap<>();

    }
}
