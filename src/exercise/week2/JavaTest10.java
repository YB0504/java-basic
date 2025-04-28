package exercise.week2;

import java.util.Arrays;

public class JavaTest10 {
    public static void main(String[] args) {
        //10. 주어진 정수형 배열의 모든 요소를 오른쪽으로 한 칸씩 이동하는 프로그램을 작성하세요.
        //즉, 첫 번째 요소는 마지막 요소가 되어야하고, 두 번째 요소는 첫 번째 요소가 되어야 합니다.
        //나머지 요소들도 마찬가지입니다.
        //아래와 같은 정수형 배열이 주어진다면, 출력 결과는 다음과 같아야 합니다.
        // 정수형 배열
        int[] array = {1, 2, 3, 4, 5};
        // 출력 결과
        //[5, 1, 2, 3, 4]
        shiftRight(array);
        System.out.println(Arrays.toString(array));

        shiftLeft(array);
        System.out.println(Arrays.toString(array));
    }

    private static void shiftRight(int[] array) {
        int temp = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    private static void shiftLeft(int[] array) {
        int temp = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = temp;
    }
}
