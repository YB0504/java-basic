package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 기본 생성자
    // 클래스의 이름과 같은 이름을 가진다.
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출! name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
