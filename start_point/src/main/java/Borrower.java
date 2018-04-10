import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void buyBook(Library library) {
        Book book = library.sellBook();
        collection.add(book);
    }

    public int bookCount() {
        return collection.size();
    }
}
