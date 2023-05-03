import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {

        Item item1 = new Item("Soda", 2.50);
        Item item2 = new Item("Hamburger", 7.99);
        Item item3 = new Item("Cheeseburger", 8.99);
        Item item4 = new Item("Side Salad", 5.00);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        System.out.println(order1.name);
        System.out.println(order1.total);

        order1.addItem(item1);
        System.out.println(order2.total);

        order3.addItem(item3);
        order4.addItem(item2);
        order1.ready = true;
        order1.printOrder();

        order4.addItem(item1);
        order4.addItem(item2);

        order2.ready = true;
    }
}