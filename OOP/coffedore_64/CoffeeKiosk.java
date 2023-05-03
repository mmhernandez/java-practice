import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // CONSTRUCTOR
    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    // OTHER CLASS METHODS
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }

    public void displayMenu() {
        for(Item each : menu) {
            System.out.format(each.getIndex() + " " + each.getName() + " -- $%.2f%n", each.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter the customer name for this new order: ");
        String name = System.console().readLine();

        displayMenu();

        Order newOrder = new Order(name);
        String itemNumber = "";
        while(!itemNumber.equals("q")) {
            System.out.println("Enter a menu item index to add to this order (or press q to quit): ");
            itemNumber = System.console().readLine();
            if(itemNumber.equals("q")) {
                break;
            }
            newOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
        }

        System.out.println("Thank you for your order!");
        System.out.println("Order details for " + name + " are listed below:");
        newOrder.printOrder();
    }

}