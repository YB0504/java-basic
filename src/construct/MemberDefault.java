package construct;

public class MemberDefault {
    String name;

    // 기본 생성자
    // 클래스에 생성자가 하나도 없다면
    // 자바는 매개변수가 하나도 없는 기본 생성자를 자동으로 생성한다.
    // 단, 생성자가 하나라도 있다면 자바는 기본 생성자를 만들지 않는다.
    MemberDefault() {
        System.out.println("기본 생성자 호출");
    }
}
