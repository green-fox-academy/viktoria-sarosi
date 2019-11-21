public class Bunnies {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(bunnies(n));
    }

    private static int bunnies(int n) {
        if(n == 1){
            return 2;
        }
        return 2 + (bunnies(n-1));
    }
}
