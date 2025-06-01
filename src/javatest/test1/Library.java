package javatest.test1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<History> histories = new ArrayList<>();

    public void addBook(String name, String author) {
        books.add(new Book(name, author));
    }

    public void listBooks() {
        System.out.println("== 현재 도서관의 도서 목록 ==");
        int index = 1;
        for (Book book : books) {
            System.out.println("(" + index + ") 제목: " + book.getName() +
                    ", 저자: " + book.getAuthor() +
                    ", 대여여부: " + book.isRented());
            index++;
        }
    }

    public void rentBook(String bookName, String studentName) {
        Book book = findBook(bookName);
        if (book == null) {
            System.out.println("해당 제목의 도서는 존재하지 않습니다.");
            return;
        }
        if (book.isRented()) {
            System.out.println("이미 대여 중인 도서입니다.");
            return;
        }
        book.rent();
        String time = now();
        histories.add(new History(bookName, studentName, "대여", time));
        System.out.println("[==> 대여] " + studentName + " 님이 <<" + bookName + ">> 도서를 대여하였습니다.");
    }

    public void returnBook(String bookName, String studentName) {
        Book book = findBook(bookName);
        if (book == null) {
            System.out.println("해당 제목의 도서는 존재하지 않습니다.");
            return;
        }
        if (!book.isRented()) {
            System.out.println("이 도서는 현재 대여 중이 아닙니다.");
            return;
        }
        book.returnBook();
        String time = now();
        histories.add(new History(bookName, studentName, "반환", time));
        System.out.println("[<== 반환] " + studentName + " 님이 <<" + bookName + ">> 도서를 반환하였습니다.");
    }

    public void showHistories() {
        System.out.println("== 현재 도서관 대여 이력 ==");
        for (History h : histories) {
            System.out.println(h);
        }
    }

    private Book findBook(String name) {
        for (Book b : books) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    private String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
