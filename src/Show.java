public class Show {
    private Seat[][] seats;

    public Show(int rows, int cols) {
        seats = new Seat[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public Seat getSeat(int r, int c) {
        if (r < 0 || c < 0 || r >= seats.length || c >= seats[0].length) return null;
        return seats[r][c];
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
    }
}
