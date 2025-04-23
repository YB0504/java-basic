package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 1;
        data.publicMethod();

        // default 호출 다른 패키지에서 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 호출 AccessData 내부에서만 호출 가능
//        data.privateFeild = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
