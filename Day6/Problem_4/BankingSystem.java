package Day6.Problem_4;
import java.util.List;
import java.util.Scanner;

// Abstract class BankAccount representing a generic bank account
abstract class BankAccount {
    private String accountNumber; // Account number of the holder
    private String holderName;   // Name of the account holder
    private double balance;      // Current account balance

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposite(double amount) {
        if (amount < 0) { // Check for invalid deposit amount
            System.out.println("Enter the invalid amount");
        } else {
            balance = balance + amount; // Add the amount to balance
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount < 0 || balance < amount) { // Check for invalid withdrawal or insufficient balance
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount; // Deduct the amount from balance
        }
    }

    // Getter and setter methods for accountNumber, holderName, and balance
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method to calculate interest, to be implemented in subclasses
    public abstract double calculateInterest();
}

// Interface Loanable with methods for loan functionality
interface Loanable {
    public void applyForLoan(double loanAmount);      // Method to apply for a loan
    public boolean calculateLoanEligibility();       // Method to check loan eligibility
}

// SavingsAccount subclass that represents a savings account
class SavingsAccount extends BankAccount implements Loanable {
    private double interest;       // Interest rate for the savings account

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String holderName, double balance, double interest) {
        super(accountNumber, holderName, balance);
        this.interest = interest;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interest; // Calculate interest based on balance and interest rate
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (calculateLoanEligibility()) { // Check loan eligibility
            System.out.println(getHolderName() + " is approved for loan for $" + loanAmount);
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Loan eligibility requires a balance of at least 10,000
    }
}

// CurrentAccount subclass that represents a current account
class CurrentAccount extends BankAccount implements Loanable {
    private int interest;       // Interest rate for the current account

    // Constructor to initialize current account details
    public CurrentAccount(String accountNumber, String holderName, double balance, int interest) {
        super(accountNumber, holderName, balance);
        this.interest = interest;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interest; // Calculate interest based on balance and interest rate
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (calculateLoanEligibility()) { // Check loan eligibility
            System.out.println(getHolderName() + " is approved for loan for $" + loanAmount);
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Loan eligibility requires a balance of at least 5,000
    }
}

// Main class to demonstrate the banking system
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner for input
        double loanAmount = sc.nextDouble(); // Input loan amount

        // Create instances of SavingsAccount and CurrentAccount
        BankAccount savingAccount = new SavingsAccount("0111UC00003110023", "Shriyansh Gupta", 20000, 7.5);
        BankAccount currentAccount = new CurrentAccount("031SBI700065423", "Siddhart Shrivastava", 40000, 9);

        // List to hold the bank accounts
        List<BankAccount> bankAccounts = List.of(savingAccount, currentAccount);

        // Iterate through each account and perform operations
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println("The name of account holder is: " + bankAccount.getHolderName());
            System.out.println("Account Number: " + bankAccount.getAccountNumber());

            // Deposit money and print the balance
            bankAccount.deposite(500);
            System.out.println("The available balance after deposit is: " + bankAccount.getBalance());

            // Withdraw money and print the balance
            bankAccount.withdraw(3000);
            System.out.println("The available balance after withdrawal is: " + bankAccount.getBalance());

            // Check for loan eligibility and apply for loan if applicable
            if (bankAccount instanceof Loanable) {
                ((Loanable) bankAccount).applyForLoan(loanAmount);
            }
            System.out.println(); // Print an empty line for clarity
        }
    }
}

