import java.util.Scanner;
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

    public class GuessTheNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the number!");
            int a = scanner.nextInt();
            while (a != 8) {
                if (a < 8) {
                    System.out.println("The stored number is higher");
                    System.out.println("Guess again!");
                    int b = scanner.nextInt();
                    a = b;
                } if (a > 8) {
                    System.out.println("The stored number is lower");
                    System.out.println("Guess again!");
                    int c = scanner.nextInt();
                    a = c;
                }
            }
            System.out.println("The found number: 8");

        }
}
// ket kor utan befejezi?