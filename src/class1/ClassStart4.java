package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // 배열
        Student student1 = new Student();
        student1.name = "학생1";  // x001.name = "학생1"
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // 아직 null 상태로 초기화된다.
        // student1, 2의 참조값을 읽고 복사하여 배열에 대입한다.
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다. 중요!!!
        // 배열의 사용
        // 1. 배열 인덱스에 접근 students[0].name
        // 2. 배열에 복사된 참조값으로 객체에 접근 student1.name
        // System.out.println("학생1");
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
