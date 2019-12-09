package animals;

public class Bird extends Animal {
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
}
