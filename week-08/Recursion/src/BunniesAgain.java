public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunniecounter(20));
    }

    private static int bunniecounter(int n) {
            if (n == 2) {
                return 5;
            }
            if (n == 1) {
                return 2;
            } else {
                return 5 + bunniecounter(n - 2);
            }
        }
    }

