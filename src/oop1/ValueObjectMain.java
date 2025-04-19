package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        // add() 메소드를 호출하면 value++를 호출한다.
        // 이 때 기본적으로 ValueObject 내부에 본인 인스턴스에 있는 멤버변수인 value에 접근한다.
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}
