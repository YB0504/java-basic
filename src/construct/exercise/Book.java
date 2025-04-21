package construct.exercise;

public class Book {
    String title;
    String author;
    int page;

    // 생성자는 객체 생성 직후 객체를 초기화 하기 위한 특별한 메소드
    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
