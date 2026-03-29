public class Seat {
    private SeatState state;

    public Seat() {
        state = new AvailableState();
    }

    public void setState(SeatState state) {
        this.state = state;
    }

    public void book() {
        state.book(this);
    }

    public String getSymbol() {
        return state.getSymbol();
    }
}
