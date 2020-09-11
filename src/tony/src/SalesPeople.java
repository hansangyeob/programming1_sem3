import model.Customer;
import model.Interaction;
import utils.InputValidator;

import java.lang.reflect.Parameter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;



public class SalesPeople{

    private ArrayList<Interaction> interactions = new ArrayList<>();

    public ArrayList<Interaction> getInteractions() {
        return interactions;
    }

    public boolean addInteraction(Interaction interaction){
        return interactions.add(interaction);
    }

    public boolean deleteInteraction(String interactionId){
        for (int i = 0; i < interactions.size(); i++) {
            if(interactionId.equals(interactions.get(i).getId())){
                return interactions.remove(interactions.get(i));
            }
        }

        return false;
    }

    public boolean updateInteraction(String interactionId) throws ParseException {

        printInteractionUpdateManual();

        Scanner s = new Scanner(System.in);
        String newInfo = "";
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

            while(!isDone) {
                String target = s.nextLine();

                switch (target) {
                    case "date": {

                        System.out.print("Enter new date of birth(dd-mm-yyyy) : ");
                        String date = new Scanner(System.in).nextLine();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");

                        Date dDate = dateFormat.parse(date);
                        String strOutputDate = dateFormat2.format(dDate);

                        boolean isValid = InputValidator.getInstance().validateBirthDay(strOutputDate);
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


                        Boolean isValid = InputValidator.getInstance().validateAddress(newInfo);
                        if(isValid){
                            JOptionPane.showMessageDialog(null,"valid form!");
                            inter.setPotential(newInfo);
                        }else{
                            JOptionPane.showMessageDialog(null,"Invalid");
                        }
                        break;
                    }

                    case "potential": {
                        newInfo = updateInfoPrompt(target);
                        inter.setPotential(newInfo);
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

//    public void printAllInteractions(){
//
//        for (int i = 0; i < interactions.size(); i++) {
//            System.out.println(interactions.get(i));
//
//        }
//        if(interactions.size()==0){
//            System.out.println("The sales people list is empty.");
//        }
//    }

    public void printAllInteractions(){

        for (int i = 0; i < interactions.size(); i++) {
            System.out.println(interactions.get(i));
        }

        if(interactions.size()==0){
            System.out.println("The sales people list is empty.");
        }
    }




}

