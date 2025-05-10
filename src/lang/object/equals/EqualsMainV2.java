package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        // equals()를 오버라이딩 해뒀으므로 같은 id를 가지고 있는지 판단한다.
        System.out.println("equality = " + user1.equals(user2));
    }
}
