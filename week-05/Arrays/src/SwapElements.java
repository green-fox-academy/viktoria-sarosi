import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = new String []{"first", "second", "third"};
        String csere = abc[0];
        abc[0] = abc[2];
        abc[2] = csere;
        System.out.println(Arrays.toString(abc));
    }
}
