public class Aircraft {
    private int ammunition;
    private int baseDamage;
    private int maxAmmo;
    private boolean isPriority;
    private int dealtDamage;

    public Aircraft() {
        this.ammunition = 0;
        int dealtDamage = this.baseDamage * this.ammunition;
    }

    public int fight(){
        this.ammunition = 0;
        return this.dealtDamage;
    }
    public int refill(int storeOfAmmo){
        int remainingAmmo = storeOfAmmo - (maxAmmo - ammunition);
        this.ammunition = this.maxAmmo;
        return remainingAmmo;
    }

    public String getType(){
        return this.getClass().getSimpleName(); //Stringben adja vissza  a class nevét
    }

    public String getStatus(){
        String status ="Type: " + getType() + ", Ammunition: " + getAmmunition() + ", " +
                "Base Damage: " + getBaseDamage() + " All Damage: " + getDealtDamage();
        return status;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        if (ammunition > maxAmmo) return;
        this.ammunition = ammunition;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public int getDealtDamage() {
        return dealtDamage;
    }
}
