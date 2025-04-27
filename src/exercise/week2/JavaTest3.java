package exercise.week2;

import java.util.Scanner;

public class JavaTest3 {
    public static void main(String[] args) {
        //3. 사용자로부터 주어진 '계절'에 대한 문자열을 입력받는 프로그램을 작성하세요.
        //입력된 계절 문자열에 따라 다음과 같이 출력해야 합니다.
        //※ switch 문을 활용해야 합니다.
        //※ 출력 시, System.out.println() 대신에 미리 정의된 print() 를 사용하세요.
        //- "봄": "따뜻한 계절입니다."
        //- "여름": "더운 계절입니다."
        //- "가을": "시원한 계절입니다."
        //- "겨울": "추운 계절입니다."
        //- 위 항목 이외의 값: "잘못된 입력입니다."
        Scanner scanner = new Scanner(System.in);

        System.out.println("계절 이름");
        String season = scanner.next();

        printSeason(season);
    }

    private static void printSeason(String season) {
        switch (season) {
            case "봄":
                print("따뜻한 계절입니다.");
                break;
            case "여름":
                print("더운 계절입니다.");
                break;
            case "가을":
                print("시원한 계절입니다.");
                break;
            case "겨율":
                print("추운 계절입니다.");
                break;
            default:
                print("잘못된 입력입니다.");
                break;
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
