public class DiagonalMatrixWithFunction {
    public static void main(String[] args) {
        int size = 15;
        int[][] matrix = createMatrix (size);
        printMatrix (matrix);

    }
    public static void printMatrix (int [][]  matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] createMatrix (int size){
        int[][] matrix = new int [size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }


}
