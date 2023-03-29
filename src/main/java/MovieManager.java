public class MovieManager {

    private int limit;

    public MovieManager() {
        this.limit = 5;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    private String[] movies = new String[0];

    public String addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;

        return movie;
    }

    public String[] findAllMovies() {
        return movies;
    }

    public String[] findLast() {
        int resultsCount;
        if (movies.length < limit) {
            resultsCount = movies.length;

        } else {
            resultsCount = limit;
        }
        String[] tmp = new String[resultsCount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;

    }
}
