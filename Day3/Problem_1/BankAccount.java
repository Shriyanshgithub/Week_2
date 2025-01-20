package Day3.Problem_1;

//Declare the class BankAccount
 class BankAccount {
     //declare the isntances
    private static String bankName = "Swiss Bank Of India";
    private static int TotalAccounts = 0;

    private String accountHolderName;
    private final double accountNumber;

    BankAccount(String accountHolderName , double accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        TotalAccounts++;
    }
    public static int getTotalAccounts(){
        return TotalAccounts;
    }

    public void DisplayDetails(){
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Total  accounts : " + getTotalAccounts());
    }

}

class Main{
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Shriyansh" , 67364846837397.0);
        if(bankAccount1 instanceof BankAccount){
            System.out.println("bankaccount1 is the isntance of BankAccount ");
        }
        else{
            System.out.println("bankaccount1 is not isntance of BankAccount");
        }

        BankAccount bankAccount2 = new BankAccount("Himanshu" , 67364846874889.0);
        bankAccount2.DisplayDetails();
    }
}
