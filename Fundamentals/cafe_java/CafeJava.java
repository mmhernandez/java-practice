public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 4.0;
        double cappucino = 3.0;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        // System.out.println(generalGreeting + customer1 + pendingMessage); 
        // System.out.println(customer3 + readyMessage + ". " + displayTotalMessage + dripCoffee);

        // System.out.println(isReadyOrder4 ? customer4 + pendingMessage : customer4 + readyMessage + ". " + displayTotalMessage + cappucino);
        // System.out.println(displayTotalMessage + latte*2);
        // System.out.println(isReadyOrder2 ? customer2 + pendingMessage : customer2 + readyMessage);

        System.out.println(displayTotalMessage + (latte - dripCoffee));
    }
}