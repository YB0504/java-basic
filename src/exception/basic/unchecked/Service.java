package exception.basic.unchecked;

public class Service {
    // UnChecked 예외는 예외를 잡거나 던지지 않아도 된다.
    // 예외를 잡지 않으면 자동으로 밖으로 던진다.
    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    // 예외를 잡지 않아도 자동으로 상위로 넘어간다.
    // 체크 예외와 다르게 throws 선언을 하지 않아도 된다.
    public void callThrow() {
        client.call();
    }
}
