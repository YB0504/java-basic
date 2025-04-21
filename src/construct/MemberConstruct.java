package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 생성자
    // 메소드 오버로딩
    // this()
    // 인스턴스 자신의 참조값으로 자신의 생성자를 호출한다.
    MemberConstruct(String name, int age) {
        // 아래의 생성자를 호출한다.
        // this() 는 생성자 코드의 첫줄에만 작성할 수 있다.
        this(name, age, 50);
    }

    // 클래스의 이름과 같은 이름을 가진다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출! name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
