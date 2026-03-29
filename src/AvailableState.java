public class AvailableState implements SeatState {
    public void book(Seat seat) {
        seat.setState(new BookedState());
        System.out.println("Seat booked");
    }

    public String getSymbol() {
        return "A";
    }
}
