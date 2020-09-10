//package utils;
//
//import model.Customer;
//import model.Interaction;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class FileUtils {
//
//    public void saveCustomerToFile(Customer customer){
//        try{
//            FileWriter fileWriter = new FileWriter("leads.csv");
//            fileWriter.write(customer.toString());
//
//        }catch (IOException e){
//            System.out.println("Error occurred while writing customer to the file.");
//            e.printStackTrace();
//        }
//
//        System.out.println("saved! ");
//    }
//
//    public void saveInteractionsToFile(ArrayList<Interaction> interactions){
//        // save as csv file
//
//        //file open
//
//        //file append interaction
//
//        System.out.println("저장했음  ! ");
//    }
//}

package utils;

import model.Customer;
import model.Interaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

    public void saveCustomerToFile(Customer customer) throws FileNotFoundException {
        try {
            FileWriter fileWriter = new FileWriter("leads.csv");
            fileWriter.write(customer.toString());
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error occurred while writing customer to the file.");
            e.printStackTrace();
        }

        System.out.println("saved! ");
    }

            public void saveInteractionToFile(Interaction interaction) throws FileNotFoundException {
            try{
                FileWriter fileWriter = new FileWriter("inters.csv");
                fileWriter.write(interaction.toString());
                fileWriter.close();

            }catch (IOException e){
                System.out.println("Error occurred while writing sales people to the file.");
                e.printStackTrace();
            }
            Scanner scanner = new Scanner(new File("inters.csv"));
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();

            System.out.println("saved! ");
    }


//    public void saveInteractionsToFile(ArrayList<Interaction> interactions){
//        // csv file 로 저장
//
//        //file open
//
//        //file append interaction
//
//        System.out.println("저장했음  ! ");
//    }
}