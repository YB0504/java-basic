package test1;

public class Array1 {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order.length; j++) {
                if (cpr[i].equals(order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}
