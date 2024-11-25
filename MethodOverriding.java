// Superclass: BankAccount
class BankAccount {
    // Method in superclass with parameters
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " to the bank account.");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    // Overriding the method with parameters in subclass
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Depositing " + amount + " to the savings account with interest.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    // Overriding the method with parameters in subclass
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Depositing " + amount + " to the checking account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CheckingAccount
        BankAccount mySavingsAccount = new SavingsAccount();
        BankAccount myCheckingAccount = new CheckingAccount();

        // Calling the overridden methods with parameters
        mySavingsAccount.deposit(500.0);   // Output: Depositing 500.0 to the savings account with interest.
        myCheckingAccount.deposit(200.0);  // Output: Depositing 200.0 to the checking account.

        mySavingsAccount.deposit(-100.0);  // Output: Invalid deposit amount.
        myCheckingAccount.deposit(-50.0);  // Output: Invalid deposit amount.
    }
}
