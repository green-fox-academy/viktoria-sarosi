import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args)  {
        Path filepath = Paths.get("my-file.txt");
        List<String> files = null;
        try {
            files = Files.readAllLines(filepath);
        } catch (IOException e) {
            System.out.println("No such file: my-file.txt");

        }
        for (String line : files){
            System.out.println(line);
        }


    }
}
