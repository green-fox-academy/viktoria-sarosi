import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number,please!");
        int a = scanner.nextInt();

        for (int i = 1; i < a+1; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (1 + 2*(i - 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
