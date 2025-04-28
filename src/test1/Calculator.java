package test1;

public class Calculator {
    // 선언된 변수를 기준에 따라 분류
    // 상수, 클래스 변수, 인스턴스 변수, 지역 변수
    static final double PI = 3.14;  // 상수
    static int operationCount = 0;  // 클래스 변수
    private final String name = "Basic"; // 인스턴스 변수

    public int add(int x, int y) { // 지역 변수
        int sum = x + y;
        operationCount++;
        return sum;
    }

    public double area(int radius) {
        return PI * radius * radius;
    }
}
