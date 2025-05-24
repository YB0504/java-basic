package exception.basic.checked;

public class MyCheckedException extends Exception {
    // Exception을 상속 받은 예외는 체크 예외
    public MyCheckedException(String message) {
        super(message);
    }
}
