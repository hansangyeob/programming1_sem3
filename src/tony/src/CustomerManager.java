import model.Customer;
import model.Interaction;
import utils.InputValidator;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import java.util.Date;
import java.util.Scanner;


public class CustomerManager {

    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(String customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customerId.equals(customers.get(i).getId())) {
                return customers.get(i);
            }
        }
        return null;
    }

    public boolean addCustomer(Customer customer) {
        return customers.add(customer);
    }


    // updating customer information with right value
    public boolean updateCustomer(String customerId) throws ParseException{

        Customer customer = getCustomerById(customerId);

        if (customer == null) {
            return false;
        }

        printCustomerUpdateManual();

        Scanner s = new Scanner(System.in);
        boolean isDone = false;
        String newInfo = "";

        Interaction inter = null;
        while (!isDone) {
            String target = s.nextLine();

            switch (target) {
                case "name": {
                    newInfo = updateInfoPrompt(target);
                    //                customer.setName(newInfo);
                    boolean isValid = InputValidator.getInstance().validateName(newInfo);
                    if (isValid) {
                        JOptionPane.showMessageDialog(null, "valid form!");
                        customer.setName(newInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
                    break;
                }

//                    System.out.print("Enter new name : ");
//                    String newName = new Scanner(System.in).nextLine();
//                    //validating user input (String and white space only)
//                  //  boolean isValid = InputValidator.getInstance().validateName(newName);
//
//                    //if(isValid==true){
//                        customer.setName(newName);
////                    }else{
////                        System.out.println("Invalid Name!");
////                    }
//
                case "dob": {
                    System.out.print("Enter new date of birth(dd-MMM-yyyy) : ");

                    String date = new Scanner(System.in).nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");


                    Date dDate = dateFormat.parse(date);
                    String strOutputDate = dateFormat2.format(dDate);

                    boolean isValid = InputValidator.getInstance().validateBirthDay(strOutputDate);
                    if (isValid) {
                        customer.setDateOfBirth(strOutputDate);
                    } else {
                        System.out.println("Invalid birthday form!");
                    }
                    break;
                }
                case "gender": {
                    newInfo = updateInfoPrompt(target);
                    boolean isValid = InputValidator.getInstance().validateGender(newInfo);
                    if (isValid) {
                        JOptionPane.showMessageDialog(null, "valid form!");
                        customer.setGender(newInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
                    break;

                }

                case "phone": {
                    newInfo = updateInfoPrompt(target);
                    boolean isValid = InputValidator.getInstance().validatePhoneNumber(newInfo);
                    if (isValid) {
                        JOptionPane.showMessageDialog(null, "valid form!");
                        customer.setPhoneNumber(newInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
                    break;

                }

                case "email": {
                    newInfo = updateInfoPrompt(target);

                    boolean isValid = InputValidator.getInstance().validateEmail(newInfo);
                    if (isValid) {
                        JOptionPane.showMessageDialog(null, "valid form!");
                        customer.setEmail(newInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
                    break;
                }

                case "addr": {

                    newInfo = updateInfoPrompt(target);
                    //   customer.setName(newInfo);
                    boolean isValid = InputValidator.getInstance().validateAddress(newInfo);
                    if (isValid) {
                        JOptionPane.showMessageDialog(null, "valid form!");
                        customer.setAddress(newInfo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid");
                    }
                    break;
                }

                case "0": {
                    isDone = true;
                    break;
                }
                default: {
                    System.out.println("Wrong Input !");
                    printCustomerUpdateManual();
                    break;
                }
            }
        }
        return true;
    }

    public boolean deleteCustomer(String customerId) {
        Customer customer = getCustomerById(customerId);
        if (customer == null) {
            return false;
        } else {
            return customers.remove(customer);
        }
    }

    public Customer printAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        if (customers.size() == 0) {
            System.out.println("The customer list is empty.");
        }
        return null;
    }

    private void printCustomerUpdateManual() {
        System.out.println("Which information would you like to update?");
        System.out.println("OPTIONS : [name, dob (dd-MMM-yyyy), gender, phone, email, addr]");
        System.out.println("Enter '0' when update is complete.");
    }

    private String updateInfoPrompt(String updateTarget) {
        System.out.println("Type new " + updateTarget + " to update: ");
        return new Scanner(System.in).nextLine();
    }



    public void reportCustomerAge() throws ParseException {
       int oneToTen = 0;
        int tenToTwenty = 0;
        int twentyToSixty = 0;
        int overSixty = 0;

        for (int i = 0; i < customers.size(); i++) {
            Date l = getCustomers().get(i).getDateOfBirthInDate();
            Date currentTime = new Date();  //gets localDate

            long diffInDays = (currentTime.getTime()- l.getTime())/(1000*60*60*24);
            long isAge = diffInDays/365;

            if(isAge<10){
                oneToTen=+1;
            }else if(isAge <= 20){
               tenToTwenty=+1;
            }else if(isAge <= 60){
                twentyToSixty=+1;
            }else {
                overSixty=+1;
            }

        }

        System.out.println(   " CUSTOMER AGE STATISTIC "+
                       "\n================"+
                       "\n1~10  : " + oneToTen +
                       "\n10~20 : " + tenToTwenty+
                        "\n20~60 : " + twentyToSixty+
                        "\n60~   : " + overSixty);
    }

}









