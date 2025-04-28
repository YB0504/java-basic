package exercise.week5;

import java.util.*;

public class JavaTest6 {
    public static void main(String[] args) {
        // 1, 4, 3, 7, 6
        // 4, 7, 1, 6, 3
        List<Integer> list = new ArrayList<>();
        list.add(3); // 1
        list.add(6); // 2
        list.add(1); // 3
        list.add(7); // 4
        list.add(3);
        list.add(4); // 5 순서로 Stack에 진입 나올때는 반대로
        list.add(1);

        Set tset = new TreeSet(list);
        Set hset = new LinkedHashSet(list);
        // 중복 안됨
        // 순서 유지
        Stack stack = new Stack();
        stack.addAll(hset);
        // LIFO

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
