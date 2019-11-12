import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        //Path filepath = Paths.get("my-file.txt");
        String filename = "my-file.txt";
        //Path secondfilepath = Paths.get("SecondFile.txt");
        String secondfilename = "SecondFile.txt";
        System.out.println(fileCopier(filename, secondfilename));

    }

    private static boolean fileCopier(String filename, String secondfilename) {
        try {
            Files.copy(Paths.get(filename), Paths.get(secondfilename));
        } catch (IOException e) {
           e.printStackTrace();
            return false;
        }
        return true;
    }
}
