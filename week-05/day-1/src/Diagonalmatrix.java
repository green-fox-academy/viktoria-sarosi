import java.util.Scanner;

public class Diagonalmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number, please!");
        int n = scanner.nextInt();

        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //
        }
        //for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[1].length; j++) {
        //  System.out.print(matrix[i][j] + " ");
        // }
        //  System.out.println();
        // }

    }
}
// egy for looppal?