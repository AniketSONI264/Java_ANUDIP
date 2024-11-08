// Create a BankAccount class with the following private fields:

// accountNumber (String)
// balance (double)
// Write the following methods:

// Getter method for balance.
// A method deposit(double amount) that increases the balance by the amount.
// A method withdraw(double amount) that decreases the balance by the amount, but only if there is enough balance. If not, print "Insufficient balance".
// Expected output:

// Create a BankAccount object, deposit an amount, withdraw an amount, and display the balance. Also handle the case where the withdrawal exceeds the balance.
import java.util.Scanner;
class BankAccount{
    private String  accNum;
    private double bal;
    double amount =0;
    
    
    public String getAccNum(){
        return accNum;
    }
   public void setAccNum(String accNum){
        this.accNum = accNum;
     }
    public double getBal(){
        return bal;
    }
    
    public void deposit(double Damount){
        if(Damount >0){
            bal += Damount;
        }
        else{
            System.out.println("Deposite amount must be valid/Positive...");
        }
        System.out.println("Deposite Amount is :"+Damount+ " and Total Balance is : "+bal);
    }
    
    public void withdraw(double Wamount){
        if (bal >0 && bal>= Wamount){
            bal -=Wamount;
        }
        else{
            System.out.println("Insufficient Balance...");
        }
        System.out.println("Witgdrawal  Amount is :"+Wamount+ " and Total Balance is : "+bal);
    }
    
    public void bankDetails(){
        System.out.println("Bank Account NUmber : "+accNum);
        System.out.println("Bank Balance : "+bal);
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        
        System.out.println("Enter Account Number : ");
        String accNum = sc.nextLine();
        bank.setAccNum(accNum);
        
        System.out.println("Enter Deposite Amount :");
        double Damount = sc.nextDouble();
        bank.deposit(Damount);
        
        System.out.println("Enter The Withdrawal Amount : ");
        double Wamount = sc.nextDouble();
        bank.withdraw(Wamount);
        bank.bankDetails();
        sc.close();
    }
}