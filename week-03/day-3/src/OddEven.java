import java.util.Scanner;
    import java.util.Scanner;
    public class OddEven {
        public static void main(String[] args) {
            // Write a program that asks for a double that is a distance in miles,
            // then it converts that value to kilometers and prints it
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number, please!");

            int userInput1 = scanner.nextInt();

            if (userInput1%2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }


        }
    }