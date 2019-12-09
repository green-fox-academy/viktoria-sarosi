package animals;

public class Reptile extends Animal {
    private String color;
    private String habitat;

    public Reptile(String name){
        super(name);
    }
    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public String sound() {
        return "reptile sound";
    }

}
