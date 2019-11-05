public class DrawChessTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= 8; j++) {
                    if (j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();
            } else {
                for (int j = 1; j <= 8; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();
            }
         }
        }
    }
