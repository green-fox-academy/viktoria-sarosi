public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunniecounter(19));
    }

    private static int bunniecounter(int n) {
        if (n % 2 == 0) {
            if (n == 2) {
                return 5;
            } else {
                return 5 + bunniecounter(n - 2);
            }
        } else {
            if (n == 1) {
                return 3;
            } else {
                return 5 + bunniecounter(n - 2);
            }
        }
    }
}
