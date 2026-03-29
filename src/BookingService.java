public class BookingService {
    public void bookSeat(Show show, int r, int c) {
        Seat seat = show.getSeat(r, c);
        if (seat == null) {
            System.out.println("Invalid seat");
            return;
        }
        seat.book();
    }
}
