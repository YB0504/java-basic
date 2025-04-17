package reference.exercise;

import java.util.Scanner;

public class ProductMain3 {
    public static void main(String[] args) {
        // 정리
        // 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다.
        // 참조형은 참조값, 기본형은 변수에 들어있는 실제 값
        // 기본형은 null을 할당할 수 없지만, 참조형은 가능하다.
        
        // 기본형은 사용하는 값을 복사해서 전달, 참조형은 참조값을 복사해서 전달
        // 참조형은 절대 실제 인스턴스가 복사되는 것이 아니다!!!!!!!!
        // 인스턴스가 가리키고 있는 참조값(주소값)을 복사하는 것

        // 메소드 호출
        // 기본형은 메소드 내부에서 매개변수의 값을 변경해도 호출자의 값은 영향 X
        // 참조형은 메소드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경하면
        // 호출자의 객체도 변경된다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders); // 단축키 Ctrl + Alt + V
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
