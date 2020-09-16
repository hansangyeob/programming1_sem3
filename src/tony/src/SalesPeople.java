
import model.Interaction;
import utils.InputValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.ZoneId;



public class SalesPeople{

    private ArrayList<Interaction> interactions = new ArrayList<>();

    public ArrayList<Interaction> getInteractions() {
        return interactions;
    }

    public boolean addInteraction(Interaction interaction){
        return interactions.add(interaction);
    }

    // method for deleting sales people from the list.
    // using .get() method to get ID from the arraylist "interactions"
    //using .remove() to delete ID from the list.
    public boolean deleteInteraction(String interactionId){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < interactions.size(); i++) {
            if(interactionId.equals(interactions.get(i).getId())){
                System.out.println("Type 'y' to delete inter_id from the list.");
                // user need to put inter_id and y to complete the process.
                String deleteConfirm = scanner.next();
                if (deleteConfirm =="y") {
                    return true;
                    }
                return interactions.remove(interactions.get(i));
            }
        }
        return false;
    }
    // updating data of sales people

    public boolean updateInteraction(String interactionId) throws ParseException {

        printInteractionUpdateManual();
        // calling manual for updating first.
        Scanner s = new Scanner(System.in);
        String newInfo = ""; // setting target
        boolean isDone = false;
        Interaction inter = null;

        for (int i = 0; i < interactions.size(); i++) {
            if(interactionId.equals(interactions.get(i).getId())){
                // finding object to modify
                inter = interactions.get(i);
            }

            if(inter == null){
                return false;
            }
            //using "switch" to update data from the sales people list.
            while(!isDone) {
                String target = s.nextLine();
                // setting user input as a next input

                switch (target) {
                    case "date": {

                        System.out.print("Enter new date of birth(dd-mm-yyyy) : ");
                        String date = new Scanner(System.in).nextLine();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
                        //using "SimpleDateFormat" to print out exact time.

                        Date dDate = dateFormat.parse(date);
                        String strOutputDate = dateFormat2.format(dDate);
                        //this will change String value of "dDate" to String

                        boolean isValid = InputValidator.getInstance().validateBirthDay(strOutputDate);
                        //checking whether user input right form of input by using .validateBirthday from the class "InputValidator"
                        if (isValid) {
                            inter.setDateOfInteraction(strOutputDate);
                        } else {
                            System.out.println("Invalid birthday form!");
                        }
                        break;
                    }

                    case "method": {
                        newInfo = updateInfoPrompt(target);
                        inter.setInteractionMethod(newInfo);
                        //inter= interactions.getId
                        Boolean isValid = InputValidator.getInstance().validateMethod(newInfo);
                        if(isValid){
                            JOptionPane.showMessageDialog(null,"valid form!");
                            inter.setPotential(newInfo);
                            //using "JOptionPane.showMessageDialog" for popup screen.
                        }else{
                            JOptionPane.showMessageDialog(null,"Invalid");
                        }
                        break;
                    }

                    case "potential": {
                        newInfo = updateInfoPrompt(target);
                        //inter.setPotential(newInfo);
                        Boolean isValid = InputValidator.getInstance().validatePotential(newInfo);
                        if(isValid){
                            JOptionPane.showMessageDialog(null,"valid form!");
                            inter.setPotential(newInfo);
                        }else{
                            JOptionPane.showMessageDialog(null,"Invalid");
                        }
                        break;
                    }
                    case "0": {
                        isDone = true;
                        break;
                    }

                    default: {
                        System.out.println("Continue... Press '0' ");
                        break;
                    }
                }
            }
        }
        return true;
    }

    private void printInteractionUpdateManual(){
        System.out.println("Which information would you like to update?");
        System.out.println("OPTIONS : [date(MM/DD/YYYY), method, potential]");
        System.out.println("Enter '0' when update is complete.");
    }

    private String updateInfoPrompt(String updateTarget){
        System.out.print("Type new " + updateTarget + " to update : ");
        return new Scanner(System.in).nextLine();
    }

//    private Date updateInfoPrompt(Date updateTargetDate){
//        System.out.print("Type new " + updateTargetDate + " to update : ");
//        return new Scanner(System.in).next();
//    }

//    public void
//    printAllInteractions(){
//
//        for (int i = 0; i < interactions.size(); i++) {
//            System.out.println(interactions.get(i));
//
//        }
//        if(interactions.size()==0){
//            System.out.println("The sales people list is empty.");
//        }
//    }

    //printing out interactions from the arraylist  <Interaction>
    public void printAllInteractions(){

        for (int i = 0; i < interactions.size(); i++) {
            System.out.println(interactions.get(i));
        }

        if(interactions.size()==0){
            System.out.println("The sales people list is empty.");
        }
    }

    public void reportCustomerPotential(){
        Date date = new Date();
        LocalDate localDate  = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the start date(dd-MM-yyyy): ");
        String startDate = new Scanner(System.in).nextLine();

        System.out.println("Input the end date(dd-MM-yyyy): ");
        String endDate = new Scanner(System.in).nextLine();


        int P = 0;
        int Neg = 0;
        int Neu = 0;

        for(int i=0; i<interactions.size();i++){
            String CustomerPotential = interactions.get(i).getPotential();

        }
    }
}

