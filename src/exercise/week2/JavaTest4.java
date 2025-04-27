package exercise.week2;

import java.util.Scanner;

public class JavaTest4 {
    public static void main(String[] args) {
        //4. 사용자로부터 숫자를 입력받아, 그 숫자부터 시작해서 감소하는 숫자를 출력하는 프로그램을 작성하세요.
        //숫자가 0이 될 때, 반복을 종료해야 합니다.
        //※ for 문을 활용해야 합니다.
        //※ 출력 시, System.out.println() 대신에 미리 정의된 print() 를 사용하세요.
        Scanner scanner = new Scanner(System.in);

        System.out.println("시작 숫자를 입력하세요: ");
        int num = scanner.nextInt();

        countdown(num);
    }

    private static void countdown(int num) {
        for (int i = num; i >= 0; i--) {
            print(i);
        }
    }

    private static void print(int num) {
        System.out.println(num);
    }
}
