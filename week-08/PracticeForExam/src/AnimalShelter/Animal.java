package AnimalShelter;

public class Animal {
    private String ownerName;
    private boolean isHealthy;
    private int healCost;
    private String name;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getHealCost() {
        return healCost;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

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
        return name + " is " + (isHealthy ? "healthy and adoptable" : "not healthy (healing would cost : " + healCost + ") and is not adoptable");
    }

    public boolean isAdaptable() {
        return isHealthy;
    }

}
