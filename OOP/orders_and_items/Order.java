import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready = false;
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.price;
    }

    public void printOrder() {
        String status;
        if(ready) {
            status = "ready";
        } else {
            status = "not ready";
        }
        System.out.format("The order for " + this.name + " is $%.2f. The status is " + status + ".%n", total);
    }
}