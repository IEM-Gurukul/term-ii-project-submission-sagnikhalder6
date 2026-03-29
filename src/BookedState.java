public class BookedState implements SeatState {
    public void book(Seat seat) {
        System.out.println("Seat already booked");
    }

    public String getSymbol() {
        return "B";
    }
}
