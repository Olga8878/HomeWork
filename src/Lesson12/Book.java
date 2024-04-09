package Lesson12;

public class Book {
    private final int id;
    private final String title;
    private final String description;
    private final String author;

    public Book(int id, String title, String description, String authorName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = authorName;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorName='" + author + '\'' +
                '}';
    }
}
