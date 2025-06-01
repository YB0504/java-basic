package javatest.test1;

public class History {
    private final String bookName;
    private final String studentName;
    private final String action;
    private final String dateTime;

    public History(String bookName, String studentName, String action, String dateTime) {
        this.bookName = bookName;
        this.studentName = studentName;
        this.action = action;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "- 도서: " + bookName + ", 대여자: " + studentName + ", " + action + "일시: " + dateTime;
    }
}
