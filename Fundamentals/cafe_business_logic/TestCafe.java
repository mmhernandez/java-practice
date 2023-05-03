import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil Shop = new CafeUtil();

        System.out.println("----- Streak Goal Test -----");
        System.out.println(Shop.getStreakGoal());
        System.out.println(Shop.getStreakGoal(11));

        System.out.println("\n----- Order Total Test -----");
        double[] price_list = {9.50, 8.25, 2.50, 3.75};
        System.out.println(Shop.getOrderTotal(price_list));

        System.out.println("\n----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffe");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        Shop.displayMenu(menu);

        System.out.println("\n----- Display Menu with Prices Test -----");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.50);
        prices.add(3.50);
        prices.add(4.50);
        prices.add(3.50);
        Shop.displayMenu(menu, prices);

        // System.out.println("----- Add Customer Test -----");
        // ArrayList<String> customer_list = new ArrayList<String>();
        // customer_list.add("Brenda");
        // customer_list.add("Sam");
        // customer_list.add("Willy");
        // Shop.addCustomer(customer_list);

        System.out.println("\n----- Price Chart Test -----");
        Shop.printPriceChart("Columbian Coffee Grounds", 15, 3);

        System.out.println("\n----- Price Chart w/ Discount Test -----");
        Shop.printPriceChart("Scone", 2, 4, 0.50);

        System.out.println("\n----- Add Customers Test -----");
        Shop.addCustomers();
    }
}