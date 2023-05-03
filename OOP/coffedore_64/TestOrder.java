import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {

        CoffeeKiosk coffedor = new CoffeeKiosk();
        coffedor.addMenuItem("banana", 2);
        coffedor.addMenuItem("coffee", 1.5);
        coffedor.addMenuItem("latte", 4.5);
        coffedor.addMenuItem("capuccino", 3);
        coffedor.addMenuItem("muffin", 4);

        coffedor.newOrder();
    }
}