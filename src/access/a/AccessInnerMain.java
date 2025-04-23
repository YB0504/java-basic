package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 1;
        data.publicMethod();

        // default 호출(같은패키지)
        data.defaultField = 2;
        data.defaultMethod();
        
        // private 호출 AccessData 내부에서만 호출 가능
//        data.privateFeild = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
