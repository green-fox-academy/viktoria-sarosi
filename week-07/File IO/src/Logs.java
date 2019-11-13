import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
    public static void main(String[] args) {
        Path filepath = Paths.get("Log.txt");
        findIPaddresses(filepath);
        GETPOSTRatio(filepath);
    }

    private static void GETPOSTRatio(Path filepath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> getpost = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] lineparts = lines.get(i).split(" "); // szétvágja a space-ek mentén
            getpost.add(lineparts[11]); // az üres getpost listába bepakolja a 11-es indexű elemeket
        }
        int getcounter = 0;
        int postcounter = 0;
        for (int i = 0; i < getpost.size(); i++) { // megszámolja a GET-eket és POST-okat
            if (getpost.get(i).equals("GET")){
                getcounter += 1;
            } else{
                postcounter += 1;
            }
        }
        try{ // try-ban, mert hátha olyan file-t kapunk, ahol nincs GET vagy POST ls nullával nem osztunk
            System.out.println(getcounter + "/" + postcounter);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    private static void findIPaddresses(Path filepath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> ipaddresses = new ArrayList<>();
        for (int i = 0; i <lines.size() ; i++) {
            String[] lineparts=lines.get(i).split(" "); // szétszabdalja a space-ek mentén
            ipaddresses.add(i, (lineparts[8])); // a 8-as indexű elemeket bepakolja az üres listába
        }

        Set<String> uniqueIPs = new HashSet<String>(ipaddresses); // létrehoz egy setet és belepakolja az ipaddresses egyedi elemeit
        int n = uniqueIPs.size();
        String[]uniqueIPaddresses  = new String[n]; // létrehoz egy set nagyságú array-t
        uniqueIPs.toArray(uniqueIPaddresses); // belemásolja a setet
        System.out.println(Arrays.toString(uniqueIPaddresses));
        }

    }
