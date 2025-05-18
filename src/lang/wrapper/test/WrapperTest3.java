package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i1 = Integer.valueOf(str);
        System.out.println("i1 = " + i1);

        int intValue = i1.intValue();
        System.out.println("intValue = " + intValue);

        Integer i2 = Integer.valueOf(intValue);
        System.out.println("i2 = " + i2);
    }
}
