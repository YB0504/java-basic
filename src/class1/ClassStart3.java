package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        // 메모리 생성 후 student1 = x001;
        // 위와 같이 참조값을 반환한다.
        
        // 참조값을 변수에 보관하는 이유
        // 생성된 객체에 접근할 방법이 필요하기 때문
        student1.name = "학생1";  // x001.name = "학생1"
        student1.age = 15;
        student1.grade = 90;

        // 생성한 객체에 접근하여 멤버변수(Field)에
        // 값을 대입하기 위해서는 .(점)으로 접근하여 사용한다.

        Student student2 = new Student();
        // 새로이 new 키워드로 객체를 생성하면
        // 새로운 참조값을 반환한다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
