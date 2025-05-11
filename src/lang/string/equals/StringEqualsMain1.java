package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); // false 객체를 비교
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true value 비교
        // String 클래스 내부에는 equals()가 오버라이딩 되어 있다.

        String str3 = "hello"; // 문자열 풀에 hello 생성
        String str4 = "hello"; // 이미 앞에서 생성 된 문자열 풀과 같은 참조 사용
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
    }
}
