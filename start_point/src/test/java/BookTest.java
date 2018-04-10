import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    public Book book01;
    public Book book02;
    public Book book03;

    @Before
    public void before() {
        book01 = new Book("The Colour of Magic", Genre.FANTASY);
        book02 = new Book("Dungeons and Dragons", Genre.FANTASY);
        book03 = new Book("Marta's Journey through Barcelona", Genre.TRAVELS);
    }

    @Test
    public void hasAGenre() {
        assertEquals(Genre.TRAVELS, book03.getGenre());
        assertEquals(Genre.FANTASY, book01.getGenre());
    }

    @Test
    public void genreHasADescription() {
        assertEquals("Fantasy books for the RPG fan", book01.getGenre().getDescription());
    }
}
