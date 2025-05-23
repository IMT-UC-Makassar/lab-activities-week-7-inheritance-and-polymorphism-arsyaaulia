package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService, OnlineService{

    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance){
        super (accountNumber, accountHolder, balance);
        this.loanStatus = "No Loan";
    }

    @Override
    public void calculateInterest(){
        double interest = balance * 0.03;
        balance += interest;
    }

    public void applyForLoan(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Loan must be possitive");
        }

        loanStatus = "Pending";
    }

    public String checkLoanStatus(){
        return loanStatus;
    }

    @Override
    public void transferFunds(double amount, String targetAccount){
        withdraw(amount);
    }

    @Override
    public void payBills(double amount){
        withdraw(amount);
    }
}