import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    public Library library;
    public Book book01;
    public Book book02;
    public Book book03;
    public Book book04;
    public Book book05;

    @Before
    public void before() {
        library = new Library(4);
        book01 = new Book("The Colour of Magic", Genre.FANTASY);
        book02 = new Book("Dungeons and Dragons", Genre.FANTASY);
        book03 = new Book("Marta's Journey through Barcelona", Genre.TRAVELS);
        book04 = new Book("Andris Cuscus", Genre.COOKING);
        book05 = new Book("Harry Potter and the Philosopher's Stone", Genre.FANTASY);

        library.addBook(book01);
        library.addBook(book02);
        library.addBook(book03);
        library.addBook(book04);
    }

    @Test
    public void canCount() {
        assertEquals(4,library.bookCount());
    }

    @Test
    public void notEnoughSpace() {
        library.addBook(book05);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void stockCount() {
       assertEquals(2, library.getStock(Genre.FANTASY));

    }

}

