package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] splitJoin = fruits.split(",");
        String apple = splitJoin[0];
        String banana = splitJoin[1];
        String mango = splitJoin[2];

        System.out.println("apple = " + apple);
        System.out.println("banana = " + banana);
        System.out.println("mango = " + mango);

        String joinedString = String.join("->", splitJoin);
        System.out.println("joinedString = " + joinedString);
    }
}
