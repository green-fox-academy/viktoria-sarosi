package animals;

public class Mammal extends Animal {
    private String color;
    private String food;

    public Mammal(String name){
        super(name);
    }
    @Override
    public String breed() {
        return "pushing miniature versions out";
    }
    @Override
    public String sound() {
        return "mammal sound";
    }

}
