package test1;

public class Solution1 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(s1 == s2); // false 내부의 값이 같다(동일성 체크)
        System.out.println(s1.equals(s2)); // true String 내부에 equals가 서로의 값을 비교하도록 구현되어 있다.
        System.out.println(o1.equals(o2)); // false Object의 equals는 객체 자체를 비교하도록 되어있다.
    }
}
