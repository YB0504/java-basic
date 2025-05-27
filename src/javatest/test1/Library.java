package javatest.test1;

import java.time.LocalDateTime;

public class Library {

    private Books bookList;
    private boolean status;
    private LocalDateTime rentalTime;
    private LocalDateTime returnTime;


    public void setBookList(Books books) {
        this.bookList = books;
    }
}

