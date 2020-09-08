package udemy;
//create a program that implements a simple mobile phone with the following capabilities.
// able to store,modify,remove and query contact names.
// you will want to create a separate class for contacts
// create a master class(MobilePhone) that holds the ArrayList of Contacts
// the mobilePhone class has the functionality listed above.
// add a menu of options that are available.
// options: quit,print list of contacts, add new contact, update existing contact,remove contact
// and search/find contact
//when adding or updating be sure to check if the contact already exists(use name)
// be sure not to expose the inner workings of the arraylist to mobilephone
//MobilePhone should do everything with Contact object only.
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("\n enter action: (6 to show availble actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\n shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
            }
        
    }

}

private static void printContacts(){
        mobilePhone.printContacts();
}

private static void startPhone(){
    System.out.println("Starting phone.");
    }

    private static void printAction(){
        System.out.println("\nAvaliable action:\n press");
        System.out.println("0 - to shhutdown\n"+
                "1- to print contacts\n"+
                "2 - to add a new contact\n"+
                "3 - to update existing contact\n"+
                "4- remove \n"+
                "5- query if an existing contact"+
                "6 - to print a list of available action");
        System.out.println("Choose your action: ");

    }

}
