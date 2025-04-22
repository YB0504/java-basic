package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지
        User user = new User(); // 다른 패키지(import)
    }
}
