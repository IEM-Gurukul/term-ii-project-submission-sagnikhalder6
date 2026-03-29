public class Movie {
    private String name;
    private Show show;

    public Movie(String name, Show show) {
        this.name = name;
        this.show = show;
    }

    public String getName() {
        return name;
    }

    public Show getShow() {
        return show;
    }
}
