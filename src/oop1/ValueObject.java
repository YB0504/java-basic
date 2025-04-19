package oop1;

public class ValueObject {
    int value;

    // 원칙적으로 메소드는 객체를 생성해야 호출할 수 있다.
    void add() {
        value++;
        System.out.println("숫자 증가 = " + value);
    }
}
