package Pirates;

public class WarAppMain {
    public static void main(String[] args) {
        Armada Spanish = new Armada();
        Armada British = new Armada();
        Spanish.fillArmada();
        British.fillArmada();
        System.out.println(Spanish.fleet.size());
        System.out.println(British.fleet.size());
        Spanish.war(British.fleet);
    }
}
