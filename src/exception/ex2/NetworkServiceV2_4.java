package exception.ex2;

public class NetworkServiceV2_4 {

    // 예외가 처리되면 disconnect()를 호출하여 연결이 해제될 때 자원을 회수한다.
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        // 지정된 예외와는 다른 예외가 발생하여 예외가 밖으로 던져지면 무시된다.
        client.disconnect();
    }
}
