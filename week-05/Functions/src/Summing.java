public class Summing {
    public static void main(String[] args) {
        int p = 6;
        System.out.println(Summing(p));
    }
    public static int Summing(int p){
        int sum = 0;
        for (int i = 1; i <= p; i++) {
           sum+= 0 + i;
        }
        return sum;

    }
}
