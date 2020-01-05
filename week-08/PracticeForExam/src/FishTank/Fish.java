package FishTank;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private int weightGainingRate;
    boolean shortTermMemoryLoss;

    public int getWeightGainingRate() {
        return weightGainingRate;
    }

    public void setWeightGainingRate(int weightGainingRate) {
        this.weightGainingRate = weightGainingRate;
    }

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void feed() {
        this.setWeight(this.getWeight() + this.getWeightGainingRate());
    }

    public abstract void status();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}
