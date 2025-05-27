package javatest.test1;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private String bookName;
    private String author;

    public List<Books> addBooks(String bookName, String author) {
        List<Books> list = new ArrayList<>();
        Books books = new Books(bookName, author);
        list.add(books);
        return list;
    }

    public List<String> addBookAuthor(String author) {
        List<String> list = new ArrayList<>();
        list.add(author);
        return list;
    }

    public Library bookList(Books books) {
        Library library = new Library();
        library.setBookList(books);
    }
}
