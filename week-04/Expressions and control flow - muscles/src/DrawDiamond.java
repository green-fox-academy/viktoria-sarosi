import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number, please!");
        int a = scanner.nextInt();

        if (a % 2 == 1) {
            upperpart(a);
            middleline(a);
            lowerpart(a);
        }
        if (a % 2 == 0) {
            upperpart(a - 1);
            middleline(a - 1);
            middleline(a - 1);
            lowerpart(a -1);
        }
    }

    private static void lowerpart(int a) {
        for (int i = 0; i < (a + 1) / 2; i++) {
            for (int j = 0; j <= 2 * i - j; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (a - 2) - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void middleline(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void upperpart(int a) {
        for (int i = 0; i < (a - 1) / 2; i++) {
            for (int j = 0; j <= ((a - 1) / 2) - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
