package reference;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        // data는 null로 초기화되어 있는 상태이다.
        // x001.data.value -> null.value
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
