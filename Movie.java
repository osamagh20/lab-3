
import java.util.ArrayList;
import java.util.List;


public class Movie extends Media {
    private int duration;
    private List<Media> purchasedList;

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user){

        purchasedList.add(null);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        String director = getAuteur();
        List<Movie> recommendedMovies = new ArrayList<>();

        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(director) && !movie.getTitle().equals(getTitle())) {
                recommendedMovies.add(movie);
            }
        }

        return recommendedMovies;
    }

    @Override
    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " minutes";
    }
}