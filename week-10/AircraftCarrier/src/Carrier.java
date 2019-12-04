import java.util.ArrayList;

public class Carrier {
    private ArrayList<Aircraft> fleet;
    private int storeOfAmmo;
    private int healthPoints;

    public Carrier() {
        this.fleet = new ArrayList<Aircraft>();
        this.storeOfAmmo = 1000;
        this.healthPoints = 1200;
    }

    public void addAircraft(Aircraft airplane) {
        this.fleet.add(airplane);
    }

    public void fill() throws NoAmmoException {
        int totalNeededAmmo = 0;
        for (int i = 0; i < fleet.size(); i++) {
            totalNeededAmmo += fleet.get(i).getMaxAmmo() - fleet.get(i).getAmmunition();
        }
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i) instanceof F35) {
                storeOfAmmo = fleet.get(i).refill(storeOfAmmo);
            }
        }
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i) instanceof F16) {
                storeOfAmmo = fleet.get(i).refill(storeOfAmmo);
            }
        }

        if (storeOfAmmo == 0) {
            throw new NoAmmoException();
        }
    }

    public void fight(Carrier otherCarrier) {
        for (int i = 0; i < this.fleet.size() + otherCarrier.fleet.size(); i++) {
            this.fleet.get(i).fight();
            otherCarrier.fleet.get(i).fight();
            this.healthPoints -= this.healthPoints - otherCarrier.fleet.get(i).fight();
            otherCarrier.healthPoints -= otherCarrier.healthPoints - this.fleet.get(i).fight();

        }
    }

    public String getStatus() {
        int TotalDamage = 0;
        for (int i = 0; i < fleet.size(); i++) {
            TotalDamage += fleet.get(i).getDealtDamage();
        }
        String statusCarrier = "HP: " + this.healthPoints + " Aircraft count: " + this.fleet.size() + " Ammo Storage: " + storeOfAmmo + " Total damage: " + TotalDamage;
        String statusFleet = "";
        for (int i = 0; i < this.fleet.size(); i++) {
            statusFleet += fleet.get(i).getStatus() + "\n";
        }
        return statusCarrier + "\n" + "Aircrafts: " + "\n" + statusFleet;
    }
}
