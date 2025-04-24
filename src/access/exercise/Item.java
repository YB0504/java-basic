package access.exercise;

public class Item {
    String name;
    int price;
    int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int totalPrice() {
        return price * quantity;
    }
}
