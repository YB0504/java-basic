package access.a;

public class PublicClass {
    public static void main(String[] args) {
        // public 클래스는 반드시 파일명과 클래스명이 동일해야 한다.
        // 하나의 자바 파일에는 public 클래스는 하나만 존재할 수 있다.
        // 클래스 레벨에서의 접근제어자는 public, default만 사용할 수 있다.
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {
}

class DefaultClass2 {
}
