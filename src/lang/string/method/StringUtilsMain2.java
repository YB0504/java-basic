package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean boo1 = true;
        String str = "Hello, Java!";

        // format()
        // format()에서 %d = 숫자, %b = boolean, %s = 문자열을 뜻한다.
        String format1 = String.format("num: %d, boo1: %b, str: %s", num, boo1, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        // printf()
        System.out.printf("숫자: %.2f\n", 10.1234);


        // matches()
        String regex = "Hello, (Java!|World!)";
        System.out.printf("str이 패턴과 일치하는가? " + str.matches(regex));
    }
}
