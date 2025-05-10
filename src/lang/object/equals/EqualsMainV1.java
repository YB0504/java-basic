package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // x001 == x002(동일성 비교)
        System.out.println("identity = " + (user1 == user2));

        // equals()를 오버라이딩 하지 않았기 때문에
        // ==을 제공받아 동등성이 아닌 동일성 비교를 한다.
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
