import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        Path filepath = Paths.get("my-file.txt");
        writeMyname(filepath);
    }

    private static void writeMyname(Path filepath) {
        try {
            List<String> lines = Files.readAllLines(filepath); // beolvassa a file-ból a sorokat egyesével a lines nevű listába
            lines.add("Sarosi Viktoria"); // hozzáirja a SV.t
            Files.write(filepath,lines); // visszairja az eredetei file-ba az új sorral együtt
            System.out.println(lines.toString());
        } catch (IOException e) {
            System.out.println("Unable to write file: " + filepath);
        }
    }
}
