public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n = 20;
        int s = 5880;
        System.out.println(findTheGrComDiv(n, s));
    }

    private static int findTheGrComDiv(int n, int s) {
        if(s == 0){
            return n;
        }
        return findTheGrComDiv(s, n % s);
    }
}
