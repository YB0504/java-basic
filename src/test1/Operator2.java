package test1;

import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        // 두 자리 이상의 정수 number가 주어졌을 때, 아래 코드는 이 수를 2자리씩 자른 뒤,
        // 자룬 수를 모두 더해서 그 합을 출력하는 코드이다.
        // 코드가 올바르게 동작하도록 한 줄만 수정하라.

        // * 제한 사항 -10 <= number <= 2,000,000,000
        // ex) 입력된 수가 1234인 경우 12 + 34 = 46
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 0;

//        for (int i = 0; i < 1; i++) {
        while (number > 0) {
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
