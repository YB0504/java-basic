package reference;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        // 객체(인스턴스)자체를 대입한 것이 아닌 dataA의 참조값만 복사
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);
        
        // dataA 변경
        // 참조값이 동일하기 때문에 dataA, dataB의 값이 모두 변경된다.
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);
    }
}
