package javatest.test1;

public class History {

    private String rentalBook;
    private String rentalStudent;
    private String rentalDate;

    public History(String rentalBook, String rentalStudent, String rentalDate) {
        this.rentalBook = rentalBook;
        this.rentalStudent = rentalStudent;
        this.rentalDate = rentalDate;
    }

    @Override
    public String toString() {
        return "- 도서: " + rentalBook + ", 대여자: " + rentalStudent + ", 대여일시: " + rentalDate;
    }
}
