package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
//        object.sound();  컴파일 오류 - Object 클래스는 다음 두 메소드가 없다.
//        object.move();

        // 객체에 맞는 다운 캐스팅
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
