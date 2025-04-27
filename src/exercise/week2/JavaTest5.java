package exercise.week2;

public class JavaTest5 {
    public static void main(String[] args) {
        //5. 다음 Java 코드를 실행했을 때의 출력 결과를 작성하세요
        int[] numbers = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        int target = 7;
        int i = 0;
        boolean found = false;

        while (i < numbers.length && !found) {
            if (numbers[i] == target) {
                found = true;
            } else {
                i++;
            }
        }

        System.out.println(i);
    }
}
