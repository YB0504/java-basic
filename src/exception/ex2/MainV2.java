package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    // 메인에서도 예외를 처리하지 않고 throws를 통해 밖으로 던진다.
    // error 가 발생하면 모든 곳에서 예외를 잡지 않고 있기 때문에 main() 밖으로 던져진다.
    // 메인 밖으로 예외가 던져지면 예외 메시지와 추적할 수 있는 스택 트레이스를 출력하고 프로그램을 종료한다.
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();

        // V2_2 에서 예외를 잡아 처리 했기 때문에 에러가 나더라도 프로그램이 종료되지 않는다.
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();

        // V2_3 에서는 예외가 발생하면 catch 블럭만 동작하고 정상 흐름일 때는 try 내부 코드가 동작한다.
        // 그러나 disconnect()가 호출되지 않아 자원 반납이 되지 않는다.
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();

        // disconnect()를 호출하여 예외가 발생하면 연결을 해제하고 자원을 회수한다.
//        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();

        // finally 블럭을 사용하여 다른 예외가 발생하더라도 연결을 해제하고 자원을 회수한다.
        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();

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

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
