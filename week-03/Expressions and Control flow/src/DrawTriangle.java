import java.util.Scanner;

    public class DrawTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type a number, please!");
            int a = scanner.nextInt();
            for (int i = 1; i <= a ; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();





            }

            }
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
}
