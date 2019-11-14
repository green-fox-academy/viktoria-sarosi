import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {
    public static void main(String[] args) {
        Path filename = Paths.get("Births.csv");
        mostbirths(filename);
    }

    private static void mostbirths(Path filename) {
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(filename);

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> birthsdates = new ArrayList<>();
        List<String> birthsyears = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] lineparts = lines.get(i).split(";");
            birthsdates.add(i, lineparts[1]);
        }

        for (int i = 0; i <birthsdates.size() ; i++) {
            String[] birthsdatesparts = birthsdates.get(i).split("-");
            birthsyears.add(i, birthsdatesparts[0]);
        }

        HashMap<String, Integer> yearcount = new HashMap<>();
        for (String year : birthsyears) {
            if(!yearcount.containsKey(year)){
                yearcount.put(year, 1);
            }else{
                yearcount.replace(year, yearcount.get(year)+1);
            }
        }
        int mostyearscount = Collections.max(yearcount.values());
        for (String key : yearcount.keySet()){
            if(yearcount.get(key) == mostyearscount){
                System.out.println(key);
            break;
            }
        }
    }
}
