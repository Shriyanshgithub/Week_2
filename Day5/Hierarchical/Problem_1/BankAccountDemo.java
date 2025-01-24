package Day5.Hierarchical.Problem_1;

// Base class: BankAccount
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to be overridden by subclasses
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Getters and Setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Display additional details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Getters and Setters
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Display additional details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int tenure; // in months
    private double maturityAmount;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int tenure, double maturityAmount) {
        super(accountNumber, balance);
        this.tenure = tenure;
        this.maturityAmount = maturityAmount;
    }

    // Getters and Setters
    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    // Override displayAccountType
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Display additional details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Tenure: " + tenure + " months");
        System.out.println("Maturity Amount: $" + maturityAmount);
    }
}

// Main class to test the banking system
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 3.5);
        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println();

        // Create a CheckingAccount
        CheckingAccount checking = new CheckingAccount("CA456", 2000.0, 500.0);
        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println();

        // Create a FixedDepositAccount
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 5000.0, 12, 5500.0);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}
