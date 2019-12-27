package AnimalShelter;

public class Animal {
    private String ownerName;
    private boolean isHealthy;
    private int healCost;
    private String name;

    public Animal(String name, boolean isHealthy) {
        this.name = name;
        ownerName = ownerName;
        this.isHealthy = isHealthy;
        healCost = healCost;
    }

    public void setHealCost(int healCost) {
        this.healCost = healCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " is " + (isHealthy ? "is healthy and adoptable" : "is not healthy (heal cost : " + healCost + ") and is not adoptable");
    }

    public boolean isAdaptable() {
        return isHealthy;
    }

}
