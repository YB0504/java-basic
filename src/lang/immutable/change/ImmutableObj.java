package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변 객체의 값을 메소드로 변경하기 위해서는
    // 불변 객체를 반환하는 메소드를 만들고 결과를 바탕으로 새로운 객체를 리턴한다.
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
