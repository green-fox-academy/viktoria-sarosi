import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number, please!");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int j = 1; j <= (a-1) ; j++) {
            for (int k = 1; k <= a; k++) {
                if (k == 1 || k == a ) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i = 1; i <= a; i++) {
            System.out.print("%");
        }
    }
}

