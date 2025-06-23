package Abstract;

// Abstract class representing ATM Machine
abstract class ATM {
    // Abstract method to withdraw money
    abstract void withdraw(double amount);

    // Abstract method to check account balance
    abstract void checkBalance();
}

// Real ATM Implementation: SBI ATM
class SBIATM extends ATM {
    private double balance = 10000;  // Initial balance

    // Implementation of withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Implementation of checkBalance method
    void checkBalance() {
        System.out.println("Available Balance: Rs " + balance);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating object of SBIATM
        SBIATM atm = new SBIATM();

        // Checking initial balance
        atm.checkBalance();          // Output: Available Balance: ₹10000.0

        // Performing withdrawal
        atm.withdraw(2000);          // Output: Withdrawn: ₹2000.0

        // Checking balance again
        atm.checkBalance();          // Output: Available Balance: ₹8000.0
    }
}
