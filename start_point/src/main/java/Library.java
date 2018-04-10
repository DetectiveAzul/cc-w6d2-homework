import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
       if (!isFull()) this.books.add(book);
    }

    private boolean isFull(){
        return (bookCount() >= capacity);
    }
}
