import java.util.ArrayList;

public class Carrier {
    private ArrayList<Aircraft> fleet;
    private int storeOfAmmo;
    private int healthPoints;
    private int totalDamage;

    public Carrier() {
        this.fleet = new ArrayList<Aircraft>();
        this.storeOfAmmo = 1000;
        this.healthPoints = 6000;
        for (int i = 0; i < this.fleet.size(); i++) {
            this.totalDamage += this.fleet.get(i).getDealtDamage();
        }
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
        int totaldamageCount = 0;
        for (int i = 0; i < fleet.size(); i++) {
            totaldamageCount += fleet.get(i).getDealtDamage();
        }
        this.setTotalDamage(totaldamageCount);

        if (storeOfAmmo == 0) {
            throw new NoAmmoException();
        }
    }

    public void fight(Carrier otherCarrier) {
        for (int i = 0; i < this.fleet.size(); i++) {
            this.fleet.get(i).fight();
            otherCarrier.healthPoints -= this.fleet.get(i).fight();
        }
        for (int i = 0; i < otherCarrier.fleet.size(); i++) {
            otherCarrier.fleet.get(i).fight();
            this.healthPoints -= otherCarrier.fleet.get(i).fight();
        }
        for (int i = 0; i < this.fleet.size(); i++) {
            this.fleet.get(i).setDealtDamage(0);
        }
        for (int i = 0; i < otherCarrier.fleet.size(); i++) {
            otherCarrier.fleet.get(i).setDealtDamage(0);
        }
        this.setTotalDamage(0);
        otherCarrier.setTotalDamage(0);
    }

    public String getStatus() {
        if (this.healthPoints <= 0) {
            return "It's dead, Jim.";
        } else {
            String statusCarrier = "HP: " + this.getHealthPoints() + " Aircraft count: " + this.fleet.size() + " Ammo Storage: " + storeOfAmmo + " Total damage: " + getTotalDamage();
            String statusFleet = "";
            for (int i = 0; i < this.fleet.size(); i++) {
                statusFleet += fleet.get(i).getStatus() + "\n";
            }
            return statusCarrier + "\n" + "Aircrafts: " + "\n" + statusFleet;
        }
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
