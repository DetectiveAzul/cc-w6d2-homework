import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    public Library library;
    public Library library2;
    public Book book01;
    public Book book02;
    public Book book03;
    public Borrower customer;

    @Before
    public void before() {
        library = new Library(4);
        library2 = new Library(4);
        book01 = new Book("The Colour of Magic");
        book02 = new Book("Dungeons and Dragons");
        book03 = new Book("Marta's Journey through Barcelona");

        library.addBook(book01);
        library.addBook(book02);
        library.addBook(book03);

        customer = new Borrower();
    }

    @Test
    public void canBuy() {
        customer.buyBook(library);
        customer.buyBook(library);
        customer.buyBook(library);

        assertEquals(3, customer.bookCount());
        assertEquals(0, library.bookCount());
    }

}
