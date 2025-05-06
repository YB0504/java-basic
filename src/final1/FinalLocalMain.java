package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1 
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류
        
        // final 지역 변수2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류

        method(10);
        
    }

    static void method(final int parameter) {
        // parameter = 20; // 컴파일 오류
        // final 키워드를 지역 변수에 설정할 경우
        // 최초 한번만 할당할 수 있다.
        // 할당한 이후 다시 한번 할당하면 컴파일 오류가 발생한다.
    }
}
