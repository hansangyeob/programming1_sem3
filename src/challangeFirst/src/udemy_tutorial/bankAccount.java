package udemy_tutorial;

public class bankAccount {

    //construct
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount(){
        System.out.println("Welcome to Tony bank.");
        System.out.println("Your information is below");
    }

    //getter
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //method for deposit
    public void depositFund(double amountOfDeposit){
        balance += amountOfDeposit;
        System.out.println("Your total amount of deposit is "+ balance);

    }

    //method for withdrawal
    public void withdrawalFund(double amountOfWithdraw){


        if(balance<amountOfWithdraw){
            System.out.println("You don't have enough cash in your card ");
            System.out.println("Current amount: "+ balance);
        }else{
            double leftAmount = balance -amountOfWithdraw;

            System.out.println("Withdraw successfully done");
            System.out.println("Amount: "+ leftAmount);
        }
    }


}
