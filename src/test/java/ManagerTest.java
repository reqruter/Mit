import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ManagerTest {
    @Test
    public void Test() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test1() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2() {
        FilmsManager manager = new FilmsManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}

