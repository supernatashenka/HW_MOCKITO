import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void ShouldAddFilm() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");

        String expected = "Film1";
        String actual = manager.addMovie("Film1");
    }

    @Test
    public void ShouldFindAllFilms() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");


        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLast5of7() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");


        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLast5of5() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLastOf4() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
