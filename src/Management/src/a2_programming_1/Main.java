package a2_programming_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Manage managementList = new Manage();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 11:
                    managementList.printLeadList();
                    break;
                case 12:
                    managementList.printInterList();
                    break;
                case 21:
                    addLeadId();
                    addLeadName();
                    break;
                case 22:
                    addInter();
                    break;
//                case 5:
//                    searchForItem();
//                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    //providing instruction for users
    public static void printInstruction(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options again");
        System.out.println("\t 11 - Print list of lead");
        System.out.println("\t 12 - Print list of inter");
        System.out.println("\t 21 - Add new lead");
        System.out.println("\t 22 - Add new inter");
        System.out.println("\t 6 - to quit");
    }

    public static void addLeadId() {
        System.out.println("Enter new Lead: ");
        managementList.addLeadId(scanner.nextLine());

    }

    public static void addLeadName(){
        System.out.println("Enter lead name: ");
        managementList.addLeadName(scanner.nextLine());
    }

    public static void addInter(){
        System.out.println("Enter new inter name: ");
        managementList.addInter(scanner.nextLine());
//        System.out.println("Enter your Birthday (day/month/year):");
//        managementList.addInter(scanner.nextLine());
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
//        System.out.println("Enter true for male and false for female:");
//        managementList.addInter(scanner.nextLine());
//        System.out.println("Enter your phone number:");
//        managementList.addInter(scanner.nextLine());
//        System.out.println("Enter your email:");
//        managementList.addInter(scanner.nextLine());
//        System.out.println("Enter your address:");
//        managementList.addInter(scanner.nextLine());

    }
}
