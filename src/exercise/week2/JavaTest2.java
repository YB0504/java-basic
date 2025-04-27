package exercise.week2;

public class JavaTest2 {
    public static void main(String[] args) {
        //2. 아래의 요구사항에 따라 1부터 100까지의 숫자를 출력하는 프로그램을 작성하세요.
        //※ 출력 시, System.out.println() 대신에 미리 정의된 print() 를 사용하세요.
        //- 3의 배수인 경우 "Fizz" 를 출력합니다.
        //- 5의 배수인 경우 "Buzz" 를 출력합니다.
        //- 3과 5의 공배수인 경우 "FizzBuzz" 를 출력합니다.
        //- 위의 경우에 해당하지 않으면 숫자를 그대로 출력합니다.
        for (int i = 0; i <= 100; i++) {
            if (i % (3*5) == 0) {
                print("FizzBuzz");
            } else if (i % 3 == 0) {
                print("Fizz");
            } else if (i % 5 == 0) {
                print("Buzz");
            } else {
                print(i);
            }
        }
    }

    private static void print(Object value) {
        System.out.println(value);
    }
}
