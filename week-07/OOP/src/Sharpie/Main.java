package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie First = new Sharpie("green", 2.0f);
        First.use();
        First.use();
        System.out.println(First.inkAmount);
    }
}
