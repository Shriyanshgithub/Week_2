/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, 
accountNumber, and balance.
 Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. 
The methods allow interaction with these attributes to modify and view the account's state.
*/

import java.util.Scanner;

public class BankAccount
{
    String accountHolder; 
    String accountNumber;
    long balance;

    BankAccount(String accountHolder,String accountNumber,long balance)
    {
        this.accountHolder= accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositeAmount(double deposite)
    {
        balance = balance +(long)deposite;
    }

    public void withdrawAmount(long withdraw)
    {
        if (balance<withdraw)
        {
            System.out.println("Insufficent Amount");
        }
        else
        {
            balance = balance- withdraw;
            System.out.println("Money Withdraw Succesfully");
        }

        
    }
    public void display()
        {
            System.out.println("Balance is :"+balance);
        }



}

class BankAccountMain
{
    public static void main(String ar[])
        {
            Scanner input = new Scanner (System.in);
            System.out.println("Enter Account Holder Name ");
            String accountHolder =input.next();
            System.out.println("Enter Account Number ");
            String accountNumber =input.next();
            System.out.println("Enter Balance");
            long balance =input.nextLong();

            BankAccount bankAccount = new BankAccount(accountHolder,accountNumber,balance);

            System.out.println("Enter Amount to deposite");
            double deposite = input.nextDouble();

            bankAccount.depositeAmount(deposite);

            System.out.println("Enter Amount to Withdraw");
            long withdraw = input.nextLong();

           bankAccount.withdrawAmount(withdraw);

           bankAccount.display();

        }

}

