package exercise.week4;

import com.sun.jdi.InvalidLineNumberException;

public class JavaTest7 {
    void add(int a, int b) throws InvalidNumberException, NotANumberException {
        // 7. 다음 중 메서드 오버라이딩이 잘못된 예시를 모두 고르세요.
        // a. void add(int a, int b) throws NumberException {} o
        // - 예외가 더 넓어 졌다.
        // b. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
        // c. void add(int a, int b) throws NotANumberException {}
        // d. void add(int a, int b) throws Exception {} o
        // - 예외가 더 넓어 졌다.
        // e. void add(int a, int b) throws InvalidNumberException {}
    }
}
class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}

