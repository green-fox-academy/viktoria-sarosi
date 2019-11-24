import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
        ArrayList<String> lotterynumberstogether= new ArrayList<>(); // mindegyik sorból kiszedi a lottószámokat
        for (int i = 0; i < lines.size() ; i++) {
            String[] lineparts = lines.get(i).split(";");
            lotterynumberstogether.add(lineparts[11]);
            lotterynumberstogether.add(lineparts[12]);
            lotterynumberstogether.add(lineparts[13]);
            lotterynumberstogether.add(lineparts[14]);
            lotterynumberstogether.add(lineparts[15]);
        }
        HashMap<String, Integer> numberscounted = new HashMap<>(); // megszámlálja sorban
        for (String number : lotterynumberstogether){
            if (!numberscounted.containsKey(number)){
                numberscounted.put(number, 1);
            }else{
                numberscounted.replace(number, numberscounted.get(number)+1);
            }
        }
        String tempString = "";  // ezekben fogja ideiglenesen eltárolni a megtalált legnagyobbat (5x), mert iterálás közben nem lehet kitörölni a listából, mapből
        Integer tempInteger = 0;
        for (int i = 0; i < 5; i++) {
            for (Map.Entry<String, Integer> entry : numberscounted.entrySet()){
                if(entry.getValue() == Collections.max(numberscounted.values())) {
                    tempString = entry.getKey();
                    tempInteger = entry.getValue();
                    break;
                }
            }
            numberscounted.remove(tempString, tempInteger);
            System.out.printf("Number %s was found %d times. \n", tempString, tempInteger);
        }
    }
}

