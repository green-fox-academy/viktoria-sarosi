public class SumDigits {
    public static void main(String[] args) {
        int n = 5780;
        System.out.println(sumdigits(n));
    }

    private static int sumdigits(int n) {
        if(n < 10){
            return n;
        } else {
            return n % 10 + sumdigits(n / 10);
        }
    }
}
