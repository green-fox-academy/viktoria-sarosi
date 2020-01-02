package AnimalShelter;

public class Dog extends Animal {
    public Dog(String name, boolean isHealthy) {
        super(name, isHealthy);
        setHealCost((int) (Math.random() * 8 + 1));
    }

    public Dog(boolean isHealthy) {
        super("Dog", isHealthy);
        setHealCost((int) (Math.random() * 8 + 1));
    }
}
