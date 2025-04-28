package test1;

public class School {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student("학생B");
        Student studentC = new Student("학생C", 10);
        System.out.println(studentA.age + studentB.age + studentC.age);
    }
}

class Student {
    String name = "학생A";
    int age = 10;

    // this 조심
    // 기본 생성자의 this는 다른 생성자를 불러와 사용한다.
    public Student() {
        this("학생1");
    }

    public Student(String name) {
        this(name, 12);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
