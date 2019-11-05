import java.util.Scanner;

public class Hellouser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        // The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();


        System.out.println("Hello " + userInput1 + "!");
    }
}
