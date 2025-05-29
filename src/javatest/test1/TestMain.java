package javatest.test1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        Books books = new Books();
        Student student = new Student();

        List<String> bookName = new ArrayList<>();
        List<String> authorName = new ArrayList<>();

        while (bookName.size() < 2) {

            System.out.print("● 등록할 도서의 제목을 입력하세요: ");
            String bookInput = scanner.nextLine();
            bookName.add(bookInput);
            books.setBookName(bookName);
            System.out.print("● 등록할 도서의 저자를 입력하세요: ");
            String authorInput = scanner.nextLine();
            authorName.add(authorInput);
            books.setAuthor(authorName);

        }

        System.out.println("== 현재 도서관의 도서 목록 ==");
        for (int i = 0; i < bookName.size(); i++) {
            System.out.println("(" + (i + 1) + ") 제목: " + books.getBookName().get(i)
                    + ", 저자: " + books.getAuthor().get(i) + ", 대여여부: " + library.isStatus());
        }

        System.out.print("● 도서를 대여할 학생의 이름을 입력하세요: ");
        String studentInput = scanner.nextLine();
        student.setStudent(studentInput);
        System.out.print("● 대여할 도서의 제목을 입력하세요: ");
        String rentalBook = scanner.nextLine();

        System.out.println("[==> 대여] " + student.getStudent() + " 님이 <<" + rentalBook + ">> 도서를 대여하였습니다.");

        System.out.println("== 현재 도서관 대여 이력 ==");
        LocalDateTime rentalDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String rentalHistory = rentalDate.format(formatter);
        History history = new History(rentalBook, studentInput, rentalHistory);
        System.out.println(history);
        
        // TODO: 대여 시 대여 여부 true 로 변환 도서 목록에 해당 도서가 있을 때만 대여 되도록 수정 시도

    }
}
