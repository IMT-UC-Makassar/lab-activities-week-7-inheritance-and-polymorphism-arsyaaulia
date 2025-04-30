package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException ("Amount must be possitive");
        }

        balance += 0;
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException ("Amount must be possitive");
        }

        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        } 
        
        amount -= balance;
    }
    
    public double getBalance(){
        return balance;
    }

    public abstract void calculateInterest();

    public void transferFunds(double amount, String accountNumber){
        // method transferFunds
        withdraw(amount);
    }

    public void payBills(double amount){
        withdraw(amount);
    }
}
