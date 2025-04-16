package reference;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // new 키워드로 인스턴스가 생성되면서 초기화
        System.out.println("value1 = "+data.value1);
        System.out.println("value2 = "+data.value2);
    }
}
