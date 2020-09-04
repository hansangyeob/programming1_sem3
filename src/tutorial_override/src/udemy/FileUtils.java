package udemy;

import java.io.File;
import java.util.ArrayList;


public class FileUtils {
    public void saveCustomersToFile(ArrayList<Customer> customers){

        File file = new File("./customerFile.csv");

        System.out.println("saved!");
    }


    public void saveInteractionsToFile(ArrayList<Interaction> interactions){
        // save as csv file

        //file open

        //file append interaction

        System.out.println("saved!");
    }
}
