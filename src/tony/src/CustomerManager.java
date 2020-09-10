import model.Customer;
import model.Interaction;
import utils.InputValidator;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
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

                    Scanner scanner = new Scanner(System.in);
                    //String newDateString = new Scanner(System.in).nextLine();
                    //String date = scanner.next();
                    String date = new Scanner(System.in).nextLine();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");

                   // String finalDate = customerInfoInput.nextLine();

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
//                    System.out.print("Enter new gender : ");
//                    String newGender = new Scanner(System.in).nextLine();
//                    boolean isValid = InputValidator.getInstance().validateGender(newGender);
//                    if(isValid){
//                        customer.setGender(newGender);
//                    }else{
//                        System.out.println("Invalid form. Please Type '0' or '1'.");
//                    }
//                    break;
                    newInfo = updateInfoPrompt(target);
                    //                  customer.setGender(newInfo);
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
//                    System.out.print("Enter new phone number : ");
//                    String newPhone = new Scanner(System.in).nextLine();
//
//                    boolean isValid = InputValidator.getInstance().validatePhoneNumber(newPhone);
//                    if(isValid){
//                        customer.setPhoneNumber(newPhone);
//                    }else{
//                        System.out.println("Invalid Phone Number !");
//                    }
//                    break;
                    newInfo = updateInfoPrompt(target);
                    //customer.setName(newInfo);
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
//                    System.out.print("Enter new email : ");
//                    String newEmail = new Scanner(System.in).nextLine();
//
//                    boolean isValid = InputValidator.getInstance().validateEmail(newEmail);
//                    if(isValid){
//                        customer.setEmail(newEmail);
//                    }else{
//                        System.out.println("Invalid Email!");
//                    }
//                    break;
                    newInfo = updateInfoPrompt(target);
                    //   customer.setName(newInfo);
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
//                    System.out.print("enter new address : ");
//                    String newAddr = new Scanner(System.in).nextLine();
//                    boolean isValid = InputValidator.getInstance().validateAddress(newAddr);
//                    if(isValid){
//                        customer.setAddress(newAddr);
//                    }else{
//                        System.out.println("Invalid address form!");
//                    }
//                    break;
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

//    public void reportCustomerAge() throws ParseException {
//
//        for (int i = 0; i < customers.size(); i++) {
//            Date l = LocalDate.parse(customers.get(i).getDateOfBirth());
//            LocalDate now = LocalDate.now(); //gets localDate
//            Period diff = Period.between(l, now); //difference between the dates is calculated
//
//
//            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
//            Date d = sdf.parse(String.valueOf(diff));
//
//            Calendar c = Calendar.getInstance();
//            c.setTime(d);
//            int year = c.get(Calendar.YEAR);
//            int month = c.get(Calendar.MONTH) + 1;
//            int date = c.get(Calendar.DATE);
//            LocalDate l1 = LocalDate.of(year, month, date);
//            LocalDate now1 = LocalDate.now();
//            Period diff1 = Period.between(l, now1);
//            System.out.println("age:" + diff.getYears() + "years");
//          }
//            int oneToTen = diff.getYears();
//            int tenToTwenty = diff.getYears();
//            int twentyToSixty = diff.getYears();
//            int overSixty = diff.getYears();
//
//            if (diff.getYears() < 10) {
//                oneToTen += 1;
//            } else if (diff.getYears() < 20) {
//                tenToTwenty += 1;
//            } else if (diff.getYears() < 60) {
//                twentyToSixty += 1;
//            } else if (overSixty >= 60) {
//                overSixty += 1;
//            }
//
//            System.out.println("1~10 : \n" + oneToTen+
//                                "10~20 \n:" + tenToTwenty+
//                                "20~60 \n: " + twentyToSixty+
//                                "60~ : \n" + overSixty);
//        }

    //calculate user age
    public static int calculateAge(LocalDate birthday, LocalDate currentDate){
        if((birthday !=null)&&(currentDate!=null)){
            return Period.between(birthday,currentDate).getYears();
        }else{
            return 0;
        }
    }

//    public void reportAge(){
//
//        for (int i = 0; i < customers.size(); i++) {
//            Date l = customers.get(i).getDateOfBirth();
//            Date now = new Date("09/10/2020"); //gets localDate
//            Date current = new Date(); // current time
//            System.out.println(current.getTime());
//
//            calculateAge(l,current);
//
//
//            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
//            Date d = sdf.parse(String.valueOf(diff));
//
//            Calendar c = Calendar.getInstance();
//            c.setTime(d);
//            int year = c.get(Calendar.YEAR);
//            int month = c.get(Calendar.MONTH) + 1;
//            int date = c.get(Calendar.DATE);
//            LocalDate l1 = LocalDate.of(year, month, date);
//            LocalDate now1 = LocalDate.now();
//            Period diff1 = Period.between(l, now1);
//            System.out.println("age:" + diff.getYears() + "years");
//          }
//
//    }
    }



