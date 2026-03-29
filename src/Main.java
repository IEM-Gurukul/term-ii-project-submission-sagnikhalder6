import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieService movieService = new MovieService();
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("1. View Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                movieService.displayMovies();
            } else if (choice == 2) {
                movieService.displayMovies();
                System.out.println("Select movie:");
                int m = sc.nextInt();

                Show show = movieService.getShow(m - 1);
                if (show == null) continue;

                show.displaySeats();

                System.out.println("Enter row and column:");
                int r = sc.nextInt();
                int c = sc.nextInt();

                bookingService.bookSeat(show, r, c);
            } else {
                break;
            }
        }
    }
}
