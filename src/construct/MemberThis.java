package construct;

public class MemberThis {
    String nameField;

    void initMember(String naeParameter) {
        // 클래스의 멤버변수와 매개변수의 이름이 다른 경우
        // this가 생략된다.
        nameField = naeParameter;
    }
}
