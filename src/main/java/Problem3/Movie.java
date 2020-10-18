package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() == this.getClass()) {
            Movie movie = (Movie) other;
            if (this.id == movie.id) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
