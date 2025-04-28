package exercise.week2;

import java.util.Scanner;

public class JavaTest1 {
    public static void main(String[] args) {
        // 1. 다음은 사용자로부터 세 개의 숫자를 입력받아, 입력된 숫자들의 상대 크기에 따라 다음과 같은 메시지를 출력하는 프로그램입니다.
        // 요구사항대로 동작하도록 checkNums() 메서드를 작성하세요.
        // ※ 출력 시, System.out.println() 대신에 미리 정의된 print() 를 사용하세요.
        // 세 숫자가 모두 같다면 "세 숫자가 모두 같습니다" 를 출력합니다.
        // 두 숫자만 같다면 "두 숫자가 같습니다" 를 출력합니다.
        // 세 숫자가 모두 다르다면 "세 숫자가 모두 다릅니다" 를 출력합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자");
        int num2 = scanner.nextInt();

        System.out.println("세 번째 숫자");
        int num3 = scanner.nextInt();

        checkNums(num1, num2, num3);
    }

    private static void checkNums(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            print("세 숫자가 모두 같습니다");
        } else if (num1 == num2 || num3 == num1 || num2 == num3) {
            print("두 숫자가 같습니다.");
        } else {
            print("세 숫자가 모두 다릅니다");
        } 
    }


    private static void print(String message) {
        System.out.println(message);
    }
}
