import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {
        // Create a function named rotateMatrix that takes an n×n integer matrix (array of arrays) as parameter and returns a matrix which elements are rotated 90 degrees clockwise.
        //
        //Example
        //Input
        //
        //[
        //  [1, 2, 3],
        //  [4, 5, 6],
        //  [7, 8, 9]
        //]
        //Output
        //
        //[ [ 7, 4, 1 ],
        //  [ 8, 5, 2 ],
        //  [ 9, 6, 3 ]
        //]
        int[][] first = new int[3][];
        first[0] = new int[]{1, 2, 3};
        first[1] = new int[]{4, 5, 6};
        first[2] = new int[]{7, 8, 9};
        printMatrix(rotateMatrix(first));
    }

    private static int[][] rotateMatrix(int[][] first) {
        int n = first.length;
        int[][] second = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                second[j][(n - i) - 1] = first[i][j];
            }
        }
        return second;
    }

    private static void printMatrix(int[][] second) {
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
            }
            System.out.println(Arrays.toString(second[i]));
        }
    }
}
