public class Power {
    public static void main(String[] args) {
        int base = 6;
        int n = 3;
        System.out.println(power(base, n));
    }

    private static int power(int base, int n) {
        if(n == 1){
            return base;
        }else {
            return base * (power(base, (n -1)));
        }

    }

}
