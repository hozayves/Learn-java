import java.util.*;
class BankAccount {
  private final double interestRate = 5.0/100;
  void calculateInterest() {
    double balance = 100_000;
    double interest = balance * interestRate;
    
    System.out.println("\n====Interest calculation (Default)====\n");
    System.out.println("Balance: "+ balance 
                      +"\nInterest rate: "+interestRate
                      +"\nAmount of interest: "+interest);
  }
  void calculateInterest(double balance) {
    double interest = balance * interestRate;
    System.out.println("\n====Interest calculation (Customer balance)====\n");
    System.out.println("Balance: "+ balance 
                      +"\nInterest rate: "+interestRate
                      +"\nAmount of interest: "+interest);
  }
  void calculateInterest(double balance, double annualInterest) {
    double rate = annualInterest / 100;
    double interest = balance * rate;

    System.out.println("\n====Interest calculation (custom rate)====\n");
    System.out.println("Balance: "+ balance 
                      +"\nInterest rate: "+(annualInterest/100)
                      +"\nAmount of interest: "+interest);
  }
}
// Account super class
abstract class Account {
  abstract public void widthdraw();
}

// Saving account class
class SavingsAccount extends Account {
  Scanner input = new Scanner(System.in);
  
  @Override
  public void widthdraw() {
    System.out.println("\n==== Saving Account Withdrawal (500 FRW charge) ====\n");

    System.out.print("Enter current balance: ");
    long balance = input.nextLong();

    System.out.print("Enter a withdrawal amount: ");
    long withdrawalAmount = input.nextLong();

    long charge = 500;

    if (balance >= (withdrawalAmount + charge)) {
      long newBalance = balance - (withdrawalAmount + charge);
      System.out.println("New balance: "+ newBalance);
    } else {
      System.out.println("Insufficient balance to withdraw.");
    }
  }
}

// Current account
class CurrentAccount extends Account {
  Scanner input = new Scanner(System.in);
  @Override
  public void widthdraw() {
    System.out.println("\n==== Current account withdrawal (50,000 RWF overdraft allowed) ====");

    System.out.print("Enter current balance: ");
    long balance = input.nextLong();

    System.out.print("Enter a withdrawal amount: ");
    long withdrawalAmount = input.nextLong();

    long overDraftLimit = 50_000;

    if(withdrawalAmount <= balance + overDraftLimit) {
      long newBalance = balance - withdrawalAmount;
      
      if(newBalance < 0) {
        System.out.println("Overdraft used: "+ newBalance);
      } else {
        System.out.println("New balance: "+ newBalance);
      }
    } else {
      System.out.println("Withdrawal balance exceeds current balance");
    }
  }
}
public class Exercise3 {
  public static void main(String[] args) {

    // Method overloading
    BankAccount account = new BankAccount();
    account.calculateInterest();
    account.calculateInterest(1000);
    account.calculateInterest(1000, 10);
    System.out.println("\n------------------------------------------------------------");
    // Polymorphism
    Account acc;
    acc = new SavingsAccount();
    acc.widthdraw();

    acc = new CurrentAccount();
    acc.widthdraw();
  }
}