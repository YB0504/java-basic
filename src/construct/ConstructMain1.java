package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자가 도입되면 객체 생성과 동시에
        // 생성자를 호출하면서 매개변수를 전달해야 한다.
        
        // 생성자 장점
        // 1. 필요한 객체를 여러번 호출할 필요가 없어진다.
        // 2. 메소드를 실수로 호출하지 않아서 데이터가 없는 상태를 방지한다.
        //    (주로 필수값을 이런 형태로 사용한다.)
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("name: " + member.name + ", age: " + member.age + ", grade: " + member.grade);
        }
    }
}
