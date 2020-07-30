package udemy_tutorial;

public class testBankAccount {
    public static void main(String[] args) {

        bankAccount TonyBank = new bankAccount();

        TonyBank.setCustomerName("Han sang yeob");
        TonyBank.setBalance(100);


        System.out.println("Hello "+TonyBank.getCustomerName());
        System.out.println("Your Balance is "+TonyBank.getBalance());
        TonyBank.depositFund(1000);
        TonyBank.withdrawalFund(1001);





    }
}
