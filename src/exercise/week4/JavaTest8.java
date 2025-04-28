package exercise.week4;

class MyException3 extends RuntimeException {
}

class MyException4 extends MyException3 {
}


public class JavaTest8 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (MyException3 ex1) {
            System.out.println(2);
            throw new MyException4();
//        } catch (MyException4 ex2) { // 컴파일 에러
//            System.out.println(3);
        }

    }
}
