import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] aj = new int[] {3,4,5,6,7,40};
        int h = aj.length;
        int[] uj = new int[h];
        for (int i = 0; i < h; i++) {
            uj[h - 1 - i] = aj[i];
        }

        System.out.println(Arrays.toString(uj));

    }
}
