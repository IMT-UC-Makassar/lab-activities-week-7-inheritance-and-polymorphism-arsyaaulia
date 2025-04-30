package oop.lab;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, String accountHolder, double balance){
        super (accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest(){
        double interest = balance * 0.05;
        balance += interest;
    }
}
