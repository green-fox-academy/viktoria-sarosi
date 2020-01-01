package AnimalShelter;

public class Cat extends Animal {

    public Cat(String name, boolean isHealthy) {
        super(name, isHealthy);
        setHealCost((int)( Math.random() * 7));
    }

    public Cat(boolean isHealthy) {
        super("Cat", isHealthy);
        setHealCost((int) (Math.random() * 7));
    }
}
