package AnimalShelter;

public class AnimalShelterMain {
    public static void main(String[] args) {
        AnimalShelter SaveAnimalsShelter = new AnimalShelter();
        System.out.println("Empty shelter:");
        System.out.println(SaveAnimalsShelter);

        SaveAnimalsShelter.rescue(new Dog("Blöki", true));
        SaveAnimalsShelter.rescue(new Cat("Mirci", true));
        SaveAnimalsShelter.rescue(new Parrot("Gyurika", false));
        SaveAnimalsShelter.rescue(new Dog("Jackie", false));

        SaveAnimalsShelter.addAdopter("Suzie");
        SaveAnimalsShelter.addAdopter("Tom");
        SaveAnimalsShelter.addAdopter("Béla");

        System.out.println("Shelter with animals:");
        System.out.println(SaveAnimalsShelter);

        SaveAnimalsShelter.heal();
        System.out.println("After healing:");
        System.out.println(SaveAnimalsShelter);
        System.out.println("After donation:");
        SaveAnimalsShelter.earnDonation(10);
        System.out.println(SaveAnimalsShelter);
        System.out.println("After finding new owner:");
        SaveAnimalsShelter.findNewOwner();
        System.out.println(SaveAnimalsShelter);
        System.out.println("After another healing:");
        SaveAnimalsShelter.heal();
        System.out.println(SaveAnimalsShelter);
    }
}
