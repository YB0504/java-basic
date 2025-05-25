package exception.ex2;

public class NetworkServiceV2_3 {

    // try ~ catch 기능을 제대로 사용하여
    // 정상 흐름과 예외 흐름을 구별한다.
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // try 안에서 정상 흐름을 모두 담는다.
        try {
            client.connect();
            client.send(data);
            client.disconnect(); // 예외 발생시 무시
        } catch (NetworkClientExceptionV2 e) {
            // catch 블럭에서 예외를 해결한다.
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
