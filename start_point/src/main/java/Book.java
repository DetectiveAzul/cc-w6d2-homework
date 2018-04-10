public class Book {
    private String name;
    private Genre genre;

    public Book(String name) {
        this.name = name;
    }
    public Book(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public Genre getGenre() {
        return this.genre;
    }
}
