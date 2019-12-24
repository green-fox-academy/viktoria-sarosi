public class main {
    public static void main(String[] args) {
        Carrier carrier1 = new Carrier();
        for (int i = 0; i < 6; i++) {
            carrier1.addAircraft(new F35());
            carrier1.addAircraft(new F16());
        }

        Carrier carrier2 = new Carrier();
        for (int i = 0; i < 8; i++) {
            carrier2.addAircraft(new F35());
            carrier2.addAircraft(new F16());
        }
        System.out.println("carrier1 empty status");
        System.out.println(carrier1.getStatus());
        System.out.println("carrier2 empty status");
        System.out.println(carrier2.getStatus());

        try {
            carrier1.fill();
        } catch (NoAmmoException e) {
            e.printStackTrace();
        }
        System.out.println("carrier1 status after fill");
        System.out.println(carrier1.getStatus());

        try {
            carrier2.fill();
        } catch (NoAmmoException e) {
            e.printStackTrace();
        }
        System.out.println("carrier2 status after fill");
        System.out.println(carrier2.getStatus());

        carrier1.fight(carrier2);
        System.out.println("carrier1 after fight");
        System.out.println(carrier1.getStatus());
        System.out.println("carrier2 after fight");
        System.out.println(carrier2.getStatus());
    }
}
