import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReversedOrder {
    public static void main(String[] args) {
        Path filepath = Paths.get("ReversedLineOrder.txt");
        reverseTheLineOrder(filepath);
    }

    private static void reverseTheLineOrder(Path filepath) {
        List<String>stillreversed = new ArrayList<>();
        try {
            stillreversed = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String correct = "";
        for (int i = stillreversed.size()-1; i > 0 ; i--){
            correct += stillreversed.get(i) +"\n";
        }
        System.out.println(correct);
    }
}
