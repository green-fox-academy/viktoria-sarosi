package reservations;

public class Reservation implements Reservationy {
    String Dow;
    String Code;

    public Reservation() {
    }

    @Override
    public String getDowBooking() {
        String dow[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return dow[(int) (Math.random() * 7)];
    }

    @Override
    public String getCodeBooking() {
        StringBuilder Code = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Code.append(randomUpperCasesAndNumbers());
        }
        return Code.toString();
    }

    public String randomUpperCasesAndNumbers() {
        if ((int) (Math.random() * 2) == 0) {
            return String.valueOf((char) (int) (Math.random() * 26 + 65));
        } else {
            return String.valueOf((char) (int) (Math.random() * 10 + 48));
        }
    }

    @Override
    public String toString() {
        return "Booking# " + getCodeBooking() + " for " + getDowBooking();
    }
}
