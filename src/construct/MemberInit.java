package construct;

public class MemberInit {
    // 생성자가 필요한 이유
    // 객체 지향 프로그래밍에서는 속성과 기능이 한 곳에 있는 것이 좋다.
    String name;
    int age;
    int grade;

    // 변수는 코드블럭 더 안쪽이 우선순위를 가진다.
    // name = name; 이런 경우 두 개의 name 모두 매개변수를 뜻하게 된다.
    void initMember(String name, int age, int grade) {
        // this
        // 자기 자신의 인스턴스를 참조한다.
        // this.name = "user1"
        // x001.name = "user1"
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
