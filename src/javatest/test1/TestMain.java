package javatest.test1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // 두 권 등록
        for (int i = 0; i < 2; i++) {
            System.out.print("● 등록할 도서의 제목을 입력하세요: ");
            String title = scanner.nextLine();
            System.out.print("● 등록할 도서의 저자를 입력하세요: ");
            String author = scanner.nextLine();
            library.addBook(title, author);
        }

        library.listBooks();

        System.out.println();
        // 대여
        System.out.print("● 도서를 대여할 학생의 이름을 입력하세요: ");
        String rentStudent = scanner.nextLine();
        System.out.print("● 대여할 도서의 제목을 입력하세요: ");
        String rentTitle = scanner.nextLine();
        library.rentBook(rentTitle, rentStudent);

        library.showHistories();
        library.listBooks();

        System.out.println();
        // 반환
        System.out.print("● 도서를 반환할 학생의 이름을 입력하세요: ");
        String returnStudent = scanner.nextLine();
        System.out.print("● 반환할 도서의 제목을 입력하세요: ");
        String returnTitle = scanner.nextLine();
        library.returnBook(returnTitle, returnStudent);

        library.showHistories();
        library.listBooks();
    }
}
