package javatest.test1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        Books books = new Books();


        System.out.print("● 등록할 도서의 제목을 입력하세요:");
        System.out.print("● 등록할 도서의 저자를 입력하세요:");
    }
}
