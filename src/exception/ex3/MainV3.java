package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        // 모든 예외를 예상하여 catch 블럭을 처리할 수 없기 때문에
        // 명확히 예상되는 ConnectException 예외를 제외하고는
        // 그 부모 -> 그리고 최상위인 Exception 예외가 처리하도록 한다.
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
