package javatest.test1;

public class Book {
    private final String name;
    private final String author;
    private boolean isRented;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isRented = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnBook() {
        isRented = false;
    }
}
