package exception.ex2;

public class NetworkServiceV2_2 {

    // 던져진 예외를 받아서 예외 복구
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // 예외 처리를 위한 예외 잡기
        // 예외를 잡아서 처리했으므로 정상 흐름으로 복귀한다.
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "
                    + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: "
                    + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
