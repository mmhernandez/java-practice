import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static int totalAccountsCount = 0;
    private static double totalAllAccountsBalance = 0;

    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();
        totalAccountsCount++;
    }

    // GETTERS
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public long getAccountNumer() {
        return this.accountNumber;
    }

    // OTHER CLASS METHODS
    public void deposit(double amount, String accountType) {
        if(accountType.toLowerCase().equals("checking")) {
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }      
    }

    public void withdraw(double amount, String accountType) {
        if(accountType.toLowerCase().equals("checking")) {
            this.checkingBalance = checkFunds(amount, this.checkingBalance);
        } else {
            this.savingsBalance = checkFunds(amount, this.savingsBalance);
        }
    }

    private double checkFunds(double amount, double balance) {
        if(balance >= amount) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Insufficient funds for withdraw");
            return balance;
        }
    }

    public double getTotalBalance() {
        return this.checkingBalance + this.savingsBalance;
    }

    private long generateAccountNumber() {
        Random rand = new Random();
        String[] rand_array = new String[10];

        for(int i=0; i<10; i++) {
            int rand_num = rand.nextInt(10);
            rand_array[i] = Integer.toString(rand_num);
        }

        String rand_string = "";
        for(String each : rand_array) {
            rand_string += each;
        }

        long stringAsNum = Long.parseLong(rand_string);
        return stringAsNum;
    }

}