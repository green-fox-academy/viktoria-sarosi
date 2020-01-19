import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLinesCode {
    public static void main(String[] args) {
        Path filepath = Paths.get("EncodedLinesText.txt");
        decryptTheText(filepath);
    }

    private static void decryptTheText(Path filepath) {
        List<String> decryptedText = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lines.size(); i++) {
            char[] charLine = lines.get(i).toCharArray();
            for (int j = 0; j < charLine.length; j++) {
                if(!(charLine[j] ==' ')) {
                    charLine[j]--;
                }
            }
            decryptedText.add(String.valueOf(charLine));
        }
        for (String decryptedLines : decryptedText) {
            System.out.println(decryptedLines);
        }
    }
}

