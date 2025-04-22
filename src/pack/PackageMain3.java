package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 같은 이름의 클래스가 다른 패키지에 존재하는 경우
        // 둘 중 하나만 사용가능하다.
        // 이럴때는 주로 자주 사용하는 클래스를 import 한다.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
