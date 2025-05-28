package javatest.test1;

import java.util.List;

public class Books {

    private List<String> bookName;
    private List<String> author;

    public List<String> getBookName() {
        return bookName;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setBookName(List<String> bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }
}
