package week4_tutorial;

public class bankAccount {

    private String accountNumber;
    private String owner;
    private double balance;


    public bankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }


    //getter setting
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber; //use this to diffenciate purple aN with input aN
    }

    //method
    public void deposit (double amount){
        this.balance+= amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

}
