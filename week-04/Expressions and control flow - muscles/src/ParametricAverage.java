import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number!");
        int a = scanner.nextInt();
        int[]numbers = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter a number!");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/a);
    }
}
