public class SumAll {
    public static void main(String[] args) {
        int[] ai = new int[]{3,4,5,6,7};

        int n = 0;
        for (int i = 0; i < ai.length; i++) {
            n += ai [i];
        }
        System.out.println(n);
    }
}
