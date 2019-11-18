package Animal;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal();
        Animal turtle = new Animal();
        bird.drink();
        turtle.eat();
        bird.play();
        bird.play();
        System.out.println(bird.thirst);
        System.out.println(turtle.hunger);
    }
}
