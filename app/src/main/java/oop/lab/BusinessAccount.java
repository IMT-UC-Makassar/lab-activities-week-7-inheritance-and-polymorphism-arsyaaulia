package oop.lab;

public class BusinessAccount extends BankAccount{

    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance, String loanStatus){
        super (accountNumber, accountHolder, balance);
        this.loanStatus = loanStatus;
    }

    public String getLoanStatus(){
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    @Override
    public void calculateInterest(){
        double interest = balance * 0.05;
        balance += interest;
    }
}
