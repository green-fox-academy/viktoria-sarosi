import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have?");
        int chickens = scanner.nextInt();
        System.out.println("How many pigs does the farmer have? ");
        int pigs = scanner.nextInt();

        int legs = chickens * 2 + pigs * 4;
        System.out.println(legs);

    }
}
