public class Factorio {
    public static void main(String[] args) {
        int f = 5;
        System.out.println(GiveFactorio(f));
    }
    public static int GiveFactorio(int p){
        int fakt = 1;
        for (int i = 1; i <= p; i++) {
            fakt *= i;
        }
        return fakt;
    }
}
