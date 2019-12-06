package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super();
        super.setNumberOfStrings(4);
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }
}

