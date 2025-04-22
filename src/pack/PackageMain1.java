package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        // 패키지 규칙
        // 1. 패키지의 이름과 위치는 폴더(디렉토리)와 같아야 한다.(필수)
        // 2. 패키지 이름은 모두 소문자를 사용한다.(관례)
        // 3. 패키지 이름의 앞에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.(관례)
        //    ex) com.company.myapp
        // 외부 라이브러리와 함께 사용할 때 같은 패키지에 같은 클래스 이름이
        // 존재할 수 있기 때문에 이런 것을 방지하기 위해 도메인을 거꾸로 사용한다.

        Data data = new Data(); // 같은 패키지
        pack.a.User user = new pack.a.User(); // 다른 패키지
    }
}
