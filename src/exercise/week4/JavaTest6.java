package exercise.week4;

class MyException1 extends Exception {

}

class MyException2 extends RuntimeException {

}

public class JavaTest6 {
    public static void main(String[] args) throws Exception {
        // 0, 3, 8, 10, 5, 6, 7, 1
        try {
            System.out.println(0);
            method1();
            System.out.println(1);
            throw new MyException1();
        } catch (RuntimeException e) {
            e.printStackTrace();
//            System.out.println(2);
        }
    }

    private static void method1() {
        try {
            System.out.println(3);
            method2();
//            System.out.println(4);
        } catch (Exception e) { // method3의 예외 받기
            System.out.println(5);
            e.printStackTrace();
            System.out.println(6);
        } finally {
            System.out.println(7); // 무조건 실행
        }
    }

    private static void method2() {
        System.out.println(8);
        method3();
//        System.out.println(9);
    }

    private static void method3() {
        System.out.println(10);
        throw new MyException2(); // 예외 던지기 RuntimeException을 받을 수 있는 곳에서 받는다.
    }

}
