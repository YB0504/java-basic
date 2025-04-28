package test1;

public class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void foo() {
        if (this instanceof InterfaceA) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
