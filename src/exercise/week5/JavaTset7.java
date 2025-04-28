package exercise.week5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class JavaTset7 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        // HashSet은 equals()와 hashCode()를 이용하여 중복을 판단함
        // 아래의 내용은 중복되지 않는다고 볼 수 있음
        Student student1 = new Student("Kim", 10);
        Student student2 = new Student("Kim", 10);
        Student student3 = new Student("Lee", 10);
        Student student4 = new Student("Park", 20);
        Student student5 = new Student("Lee", 20);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(student1.equals(student2)); // (1) true: equals()를 오버라이딩 하여 같다고 판단하게 함(내용 같음)
        System.out.println(student1 == student2); // false: 서로 다른 객체임
        System.out.println(students.size()); // (2) 5: 원래는 중복이 허용되지 않지만 hashCode()의 구현으로 서로 다른 객체로 판단
        System.out.println(students.contains(new Student("Lee", 10))); // false
        // new 연산자로 새로 만든 Student의 값이기 때문에 sudents내부에 동일한 hashCode가 존재하지 않음

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        // name과 age값을 주지 않았으므로 객체자체만 판단
        return super.hashCode();
    }
}
