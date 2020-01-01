package AnimalShelter;

public class Parrot extends Animal {
    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy);
        setHealCost((int) (Math.random() * 7 + 4));
    }
    public Parrot(boolean isHealthy) {
        super("Parrot", isHealthy);
        setHealCost((int) (Math.random() * 7 + 4));
    }
}
