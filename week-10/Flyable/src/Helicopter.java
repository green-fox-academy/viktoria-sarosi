public class Helicopter extends Vehicle implements  Flyable {

    public Helicopter() {
    }

    @Override
    public void land() {
        System.out.println("The " + getClass().getSimpleName() + " touches the ground.");
    }

    @Override
    public void fly() {
        System.out.println("The " + getClass().getSimpleName() + " spins its rotors.");
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getClass().getSimpleName() + " starts to spin its rotors.");
    }
}
