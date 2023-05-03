import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {

        Item item1 = new Item("Soda", 2.50);
        Item item2 = new Item("Hamburger", 7.99);
        Item item3 = new Item("Cheeseburger", 8.99);
        Item item4 = new Item("Side Salad", 5.00);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        order1.setName("Cindhuri");
        order2.setName("Jimmy");

        System.out.println(order1.getName());
        System.out.println(order1.getOrderTotal());

        order1.addItem(item1);
        System.out.println(order1.getOrderTotal());

        order3.addItem(item3);
        order4.addItem(item2);
        order1.setIsReady(true);
        order1.printOrder();

        order4.addItem(item1);
        order4.addItem(item2);

        order2.setIsReady(true);
    }
}