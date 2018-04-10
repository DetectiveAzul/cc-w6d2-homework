public enum Genre {
    FANTASY("Fantasy books for the RPG fan"),
    TRAVELS("Never get lost on your trips"),
    COOKING("Don't you know what to cook?");

    private final String description;

    Genre(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
}
