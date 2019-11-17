import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
            Path filepath = Paths.get("winO.txt");
            ticTacResult(filepath);
    }

    private static void ticTacResult(Path filepath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[][] splittedlines = new String [3][];
        //splittedlines[0] = new String[0];
        //splittedlines[1] = new String[0];
        //splittedlines[2] = new String[0];

        for (int i = 0; i < lines.size(); i++) {
            splittedlines[i] = lines.get(i).split("");
            if (splittedlines[i][0].equals(splittedlines[i][1]) && splittedlines[i][1].equals(splittedlines[i][2])) {
                System.out.println(splittedlines[i][0]);
            }
        }
        for (int i = 0; i < splittedlines.length; i++) {
            if (splittedlines[0][i].equals(splittedlines[1][i]) && splittedlines[1][i].equals(splittedlines[2][i])){
                System.out.println(splittedlines[0][i]);
            }
        }
        if (splittedlines[0][0].equals(splittedlines[1][1]) && splittedlines[1][1].equals(splittedlines[2][2])){
            System.out.println(splittedlines[0][0]);
        }
        if (splittedlines[0][2].equals(splittedlines[1][1]) && splittedlines[1][1].equals(splittedlines[2][0])){
            System.out.println(splittedlines[0][2]);
        }
        else{
            System.out.println("Draw");
        }
    }
}

