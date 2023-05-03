import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i=1; i<=numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for(double each_price : prices) {
            total += each_price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i=0; i< menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }
        for(int i=0; i< menuItems.size(); i++) {
            System.out.format(i + " " + menuItems.get(i) + " -- $%.2f%n", prices.get(i));
        }
        return true;
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String username = System.console().readLine();

        System.out.println("Hello, " + username);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(username);
        
        System.out.println(customers);
    }

    public void addCustomers() {
        String escape_char = "a";
        ArrayList<String> customer_list = new ArrayList<String>();
        while(!escape_char.equals("q")) {
            System.out.println("Enter the customer's name: ");
            customer_list.add(System.console().readLine());

            System.out.println("Press enter to continue adding customers. Enter q to quit: ");
            escape_char = System.console().readLine();
        }
        
        System.out.println(customer_list);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for(int i=1; i<=maxQuantity; i++) {
            double total = price * i;
            System.out.format(i + " - %.2f%n", total);
        }
    }
    public void printPriceChart(String product, double price, int maxQuantity, double quantity_discount) {
        System.out.println(product);
        for(int i=1; i<=maxQuantity; i++) {
            double total = price * i;
            double discount;
            if(i > 1) {
                discount = (i-1) * quantity_discount;
                total -= discount;
            }
            System.out.format(i + " - %.2f%n", total);
        }
    }
}