package test1;

public class Solution {
    public static void main(String[] args) {
        InterfaceA a = new MyClass();
        InterfaceB b = new MyClass();

        a.foo();
        b.foo();
    }
}