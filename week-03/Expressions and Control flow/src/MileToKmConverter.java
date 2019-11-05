import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the numbers of miles, please!");

        double userInput1 = scanner.nextDouble();

        double km = userInput1 * 1.609;
        System.out.println("The distance is " + km + " km.");


    }
}
