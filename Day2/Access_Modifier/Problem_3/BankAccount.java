package Day2.Access_Modifier.Problem_3;

// Base class: BankAccount
class BankAccount {
    // Instance variables
    public String accountNumber; // Public variable
    protected String accountHolder; // Protected variable
    private double balance; // Private variable

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter method for balance
    public double getBalance() {
        return balance;
    }

    // Public setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount (Inheriting from BankAccount)
class SavingsAccount extends BankAccount {
    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        // Calling the superclass constructor
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details (Demonstrating access to accountNumber and accountHolder)
    public void displaySavingsAccountDetails() {
        // Accessing public accountNumber and protected accountHolder from parent class
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public accountNumber
        System.out.println("Account Holder: " + accountHolder); // Accessing protected accountHolder
        System.out.println("Balance: " + getBalance()); // Accessing private balance through getter method
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", "John Doe", 1500.00);

        // Displaying account details
        savingsAccount.displaySavingsAccountDetails();

        // Modifying balance using the setter method
        savingsAccount.setBalance(2000.00);

        // Displaying updated account details
        System.out.println("\nUpdated Savings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}

