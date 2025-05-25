package exception.ex2;

public class NetworkService2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            // finally 블럭을 추가하여 다른 예외가 발생해도 연결을 해제하고 자원을 회수하도록 설정
            client.disconnect();
        }
    }
}
