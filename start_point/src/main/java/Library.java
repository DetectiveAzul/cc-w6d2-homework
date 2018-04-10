import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<Genre, Integer> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.stock = new HashMap<>();
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
       if (!isFull()) {
           this.books.add(book);
       }

    }

    private boolean isFull(){
        return (bookCount() >= capacity);
    }

    public Book sellBook() {
        return books.remove(0);
    }

    private void updateStock(Genre genre) {
        int total = 0;
        for (Book book: books) {
            Genre book_genre = book.getGenre();
            if (book_genre == genre) {
                total++;
            }
        }
        stock.put(genre, total);
    }

    public int getStock(Genre genre) {
        updateStock(genre);
        return stock.get(genre);
    }
}
