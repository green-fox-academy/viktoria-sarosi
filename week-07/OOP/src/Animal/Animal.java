package Animal;

public class Animal<hunger> {
    public int hunger;
    public int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat(){
        this.hunger--;
    }
    public void drink(){
        this.thirst--;
    }
    public void play(){
        this.hunger += 1;
        this.thirst += 1;
    }

}
