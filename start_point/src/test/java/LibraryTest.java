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
        book01 = new Book("The Colour of Magic");
        book02 = new Book("Dungeons and Dragons");
        book03 = new Book("Marta's Journey through Barcelona");
        book04 = new Book("Andris Cuscus");
        book05 = new Book("Harry Potter and the Philosopher's Stone");

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

}

