

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        System.out.println(acct1.getCheckingBalance());

        // acct1.deposit(100, "Checking");
        // System.out.println(acct1.getCheckingBalance());

        // acct1.deposit(50, "savings");
        // System.out.println(acct1.getTotalBalance());
        
        // acct1.withdraw(75, "checking");
        // System.out.println(acct1.getCheckingBalance());
        // acct1.withdraw(75, "Checking");
        // System.out.println(acct1.getCheckingBalance());

        System.out.println(acct1.getAccountNumer());
    }
}