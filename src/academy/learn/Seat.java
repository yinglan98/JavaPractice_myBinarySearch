package academy.learn;

public class Seat implements Comparable<Seat> {
    private String seatNumber = null;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public int compareTo(Seat seatInput) {
        return this.seatNumber.compareTo(seatInput.getSeatNumber());
    }
}
