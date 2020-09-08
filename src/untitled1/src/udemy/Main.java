package udemy;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // create object lead & inter
        Lead lead = new Lead(001, "tin", null, true, "113", "letrungtin2712@gmail.com", "111B Ly Thanh Tong");
        Inter inter = new Inter(000,"lead_000",null,"facebook","positive");

        //create an Array
        Lead[] myLeads = new Lead[999];
        Inter[] myInters = new Inter[999];

        int arrayIndex = 0;
        boolean quit = false;

        //printout instruction first
        printInstruction();

        while (!quit) {
            System.out.println("Enter your choice: ");
            arrayIndex = scanner.nextInt();

            switch (arrayIndex) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    lead.displayInfo();
                    break;
                case 2:
                    inter.displayInterInfo();
                    break;
                case 3:
                    lead.inputName();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
                    lead.inputDOB();
                    System.out.println(sdf.format(lead.getDate()));
                    lead.inputGender();
                    lead.inputPhone();
                    lead.inputEmail();
                    lead.inputAddress();
                    myLeads[arrayIndex] = lead.displayInfo();
                    //lead.displayInfo();
                    lead.updateId();
                    //arrayIndex += 1;
                    break;
                case 4:
                    SimpleDateFormat sdfInter = new SimpleDateFormat("dd/MM/yy");
                    System.out.println(sdfInter.format(inter.getDateOfInteraction()));
                    inter.inputDOI();
                    inter.inputCustomerId();
                    inter.inputReference();
                    inter.inputPotential();
                    myInters[arrayIndex] = inter.displayInterInfo();
                    inter.displayInterInfo();
                    inter.updateInterId();
               //     arrayIndex += 1;
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



    public static void printInstruction(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options again");
        System.out.println("\t 1 - Print list of lead");
        System.out.println("\t 2 - Print list of inter");
        System.out.println("\t 3 - Add new lead");
        System.out.println("\t 4 - Add new inter");
        System.out.println("\t 6 - to quit");
    }

}