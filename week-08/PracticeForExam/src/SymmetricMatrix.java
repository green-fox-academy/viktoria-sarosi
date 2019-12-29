public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] first = new int[3][];
        first[0] = new int[]{1, 2, 3};
        first[1] = new int[]{2, 5, 8};
        first[2] = new int[]{3, 8, 9};
        System.out.println(isSymmetricSimple(first));
        System.out.println(isSymmetricWithForLoop(first));
    }

    private static boolean isSymmetricWithForLoop(int[][] first) {
        boolean sym = false;
        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (first[i][j] == first[j][i]) {
                    counter++;
                }
            }
        }
        if (counter == first.length * first.length) {
            sym = true;
        }
        return sym;
    }

    private static boolean isSymmetricSimple(int[][] first) {
        boolean sym = false;
        int a = first[0][1];
        int b = first[0][2];
        int c = first[1][2];

        if ((first[1][0] == a) && (first[2][0] == b) && (first[2][1] == c)) {
            sym = true;
        }

        return sym;
    }
}
