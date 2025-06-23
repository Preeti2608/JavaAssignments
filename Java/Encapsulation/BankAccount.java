package Encapsulation;

// Encapsulation Example: BankAccount

public class BankAccount {
    // Private data members
    private String accountHolder;
    private double balance;

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

// Main class to use the BankAccount class
class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Object creation

        account.setAccountHolder("Preeti");
        account.setBalance(1000); // Initial balance

        account.deposit(500); // Deposit ₹500
        account.withdraw(300); // Withdraw ₹300

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
