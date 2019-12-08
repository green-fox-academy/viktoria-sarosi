public class main {
    public static void main(String[] args) {
        Garden botanicalGarden = new Garden();
        botanicalGarden.addPlant(new Flower("yellow", 0.0));
        botanicalGarden.addPlant(new Flower("blue", 0.0));
        botanicalGarden.addPlant(new Tree("purple", 0.0));
        botanicalGarden.addPlant(new Tree("orange", 0.0));

        botanicalGarden.state();
        botanicalGarden.waterTheGarden(40);
        botanicalGarden.state();
        botanicalGarden.waterTheGarden(70);
        botanicalGarden.state();
    }
}
