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
        for (Genre key:
             Genre.values()) {
            stock.put(key, 0);
        }
    }

    public int bookCount() {
        return books.size();
    }

    public void addStock(Book book) {
        Genre genre = book.getGenre();
        int value = stock.get(genre);
        value++;
        stock.replace(genre,value);
    }

    public void removeStock(Book book) {
        Genre genre = book.getGenre();
        int value = stock.get(genre);
        value--;
        stock.replace(genre,value);
    }

    public void addBook(Book book) {
       if (!isFull()) {
           this.books.add(book);
           addStock(book);
       }

    }

    private boolean isFull(){
        return (bookCount() >= capacity);
    }

    public Book sellBook() {
        removeStock(books.get(0));
        return books.remove(0);
    }

    //Added individual methods to add and remove stock, not needed
//    private void updateStock(Genre genre) {
//        int total = 0;
//        for (Book book: books) {
//            Genre book_genre = book.getGenre();
//            if (book_genre == genre) {
//                total++;
//            }
//        }
//        stock.put(genre, total);
//    }
//
    public int getStock(Genre genre) {
        return stock.get(genre);
    }
}
