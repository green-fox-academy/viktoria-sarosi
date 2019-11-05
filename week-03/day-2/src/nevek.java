import java.util.Scanner;

public class nevek {
    public static void main(String[] args) {
        System.out.println("please tell me your name");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        String output;
        if (myName.equals("Furkesz")) {
            output = "Hi Furkesz";
        } else if (myName.equals("Bela")) {
            output = "Nice to meet you Bela";
        } else if (myName.equals("Karoly")) {
            output = "What is up Karoly";
        } else {
            output = "Please leave the room";
        }
        System.out.println(output);






    }



}
