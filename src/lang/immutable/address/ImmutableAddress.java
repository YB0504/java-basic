package lang.immutable.address;

public class ImmutableAddress {

    // final 키워드로 인해 한번 값이 할당되면 변경되지 않는다.
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
