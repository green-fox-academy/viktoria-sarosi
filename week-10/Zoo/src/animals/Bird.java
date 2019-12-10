package animals;

public class Bird extends Animal implements Flyable{
    private String color;
    private String song;

    public Bird(String name){
        super(name);
    }
    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public String sound() {
        return "bird sound";
    }

    @Override
    public void land() {
        System.out.println("The " + getName() + " opens its wings.");
    }

    @Override
    public void fly() {
        System.out.println("The " + getName() + " moves its wings.");
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getName() + " runs and opens its wings.");
    }
}
