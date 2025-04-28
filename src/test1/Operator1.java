package test1;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 7;
        boolean result = (a++ == b--) && (c >= a++) || (++b == c);
        // 단락 평가
        // a 가 6인 이유는 첫 번째 괄호가 false 가 되므로
        // && 뒤의 결과와 무관하게 false가 된다.
        // 그래서 c >= a++ 의 연산자체를 하지 않는다.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
    }
}
