package reference;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // bigData,count = 0
        // bigData.data = reference.Data@x002
        // bigData.data.value = 0
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
