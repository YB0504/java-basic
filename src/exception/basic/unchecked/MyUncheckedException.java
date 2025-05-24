package exception.basic.unchecked;

public class MyUncheckedException extends RuntimeException {
    // RuntimeException을 상속 받은 예외는 언체크 예외가 된다.
    public MyUncheckedException(String message) {
        super(message);
    }
}
