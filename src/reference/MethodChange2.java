package reference;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전: dataA.value = " + dataA.value);
        // 참조값만 복사하는 것
        changeReference(dataA);
        System.out.println("메소드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        // dataX는 dataA의 value가 아니라 dataA의 참조값을 복사해오는 것이므로
        // dataA의 값은 10 -> 20으로 변경된다.
        dataX.value = 20;
    }
}
