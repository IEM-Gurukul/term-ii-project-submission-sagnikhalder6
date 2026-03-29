import java.util.*;

public class MovieService {
    private List<Movie> movies;

    public MovieService() {
        movies = new ArrayList<>();
        movies.add(new Movie("Inception", new Show(5,5)));
        movies.add(new Movie("Interstellar", new Show(5,5)));
    }

    public void displayMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).getName());
        }
    }

    public Show getShow(int index) {
        if (index < 0 || index >= movies.size()) return null;
        return movies.get(index).getShow();
    }
}
