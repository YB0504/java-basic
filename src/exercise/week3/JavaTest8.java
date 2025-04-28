package exercise.week3;

public abstract class JavaTest8 {
        //8. 다음과 같이 정의된 클래스들에 대한 올바른 설명을 모두 고르세요.
        //(1) Child 클래스는 Parent 클래스를 상속 받으므로, farewell 메서드를 오버라이딩 할 수 있다. x
        //(2) Parent에서 선언된 greet 메서드는 추상 메서드로, Child 클래스에서 반드시 구현해야 한다. o
        //(3) Child 클래스에서 Parent 클래스에 선언된 num 변수의 값을 변경할 수 있다. x
        //(4) Child 클래스 객체를 생성하여 farewell 메서드를 호출하면 "Goodbye!" 메시지가 출력된다. o
        //(5) Child 클래스에서는 Parent 클래스의 추상 메서드인 greet를 오버라이딩 했다. o

        final int num = 10;

        abstract void greet ();

        final void farewell () {
            System.out.println("GoodBye");
        }
}

class Child extends JavaTest8 {
    void greet() {
        System.out.println("Hello!");
    }
}
