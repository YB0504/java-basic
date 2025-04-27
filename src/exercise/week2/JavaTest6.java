package exercise.week2;

import java.util.Scanner;

public class JavaTest6 {
    public static void main(String[] args) {
        // 6. 아래의 for 문을 활용한 Java 코드와 동일하게 동작하는 코드를 while 문을 활용하여 작성하세요.
        // ※ 출력 시, System.out.println() 대신에 미리 정의된 print() 를 사용하세요.
        // for 문
//        for (int i = 0; i < 10; i++) {
//            if (i % 3 == 0) {
//                print(i+" is divisible by 3");
//            }
//        }

        // while 문이 무한 루프에 빠지지 않기 위해서는 증감식이 필요하다.
        int i = 0;
        while (i < 10) {
            if (i % 3 == 0) {
                print(i+" is divisible by 3");
            }
            i++;
        }

    }

    private static void print(String message) {
        System.out.println(message);
    }
}
