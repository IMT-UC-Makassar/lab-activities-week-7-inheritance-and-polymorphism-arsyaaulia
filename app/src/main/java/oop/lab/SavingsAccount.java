package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService{

    public SavingsAccount(String accountNumber, String accountHolder, double balance){
        super (accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest(){
        double interest = balance * 0.05;
        balance += interest;
    }

    @Override
    public void transferFunds (double amount, String targetAccount){
        withdraw(amount);
    }

    public void payBills (double amount){
        withdraw(amount);
    }
}
