import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready = false;
    private ArrayList<Item> items;

    // CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }


    // GETTERS
    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setIsReady(boolean ready) {
        this.ready = ready;
    }


    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.isReady()) {
            return "Your order is ready";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item each_item : this.getItems()) {
            total += each_item.getPrice();
        }

        return total;
    }

    public void printOrder() {
        System.out.println("Customer Name: " + this.getName());
        for(Item each_item : this.getItems()) {
            System.out.format(each_item.getIndex() + " " + each_item.getName() + " - $%.2f%n", each_item.getPrice());
        }
        System.out.format("Total: $%.2f%n", getOrderTotal());
    }
}