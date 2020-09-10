package utils;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class InputValidator {
    // using "Singleton pattern"
    private static InputValidator instance;

    private InputValidator() {
    }

    public static InputValidator getInstance() {
        if (instance == null) {
            // if calling other value, it will not reply.
            instance = new InputValidator();
        }
        return instance;
    }

    // regular expression for the right user input
    private final String nameRegex = "^[a-zA-Z\\s]+";
    private final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private final String phoneRegex = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
    private final String genderRegex = "[0-1]";
    private final String addressRegex = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";

    public boolean validateName(String name) {
//            // Check if user input is 'null'
//        if (name.trim().equals("")) {
//            return true;
//        } else {
//            //using "compile" to provide method for finding pattern
//            Pattern pattern = Pattern.compile(nameRegex);
//            Matcher matcher = pattern.matcher(name);
//            return matcher.matches();
//        }
        if (name.trim().equals("")) {
            return true;
        } else {
            return Pattern.matches("[a-zA-Z]+", name);
            //using pattern class and matches method.
            // checking if "name" is matches with regex
        }
    }

    public boolean validateEmail(String email) {
//        if (email.trim().equals("")) {
//            return true;
//        } else {
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
//    }

    public boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.trim().equals("")) {
            return true;
        } else {
            Pattern pattern = Pattern.compile(phoneRegex);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }
    }

    public boolean validateGender(String gender) {
        if (gender.trim().equals("")) {
            return true;
        } else {
            Pattern pattern = Pattern.compile(genderRegex);
            Matcher matcher = pattern.matcher(gender);
            return matcher.matches();
        }
    }

    public boolean validateAddress(String address) {
        if (address.trim().equals("")) {
            return true;
        } else {
            Pattern pattern = Pattern.compile(addressRegex);
            Matcher matcher = pattern.matcher(addressRegex);
            return matcher.matches();
        }
    }


    public boolean validatePotential(String method) {
        while (method == "P") {
            System.out.println("Your method have been changed successfully.");
            if (method == "NEU") {
                if (method == "NEG") {
                    System.out.println("Your method have been changed successfully.");
                }
            }
        }
        return true;
    }

    public boolean validateBirthDay(String strDate) {
        // Check if date is 'null'
        if (strDate.trim().equals("")) {
            return true;
        }
        System.out.println("valid! press '0' to finish this stage.");
        return true;
    }

}
//        else {
//             //Set preferred date format
//            //For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.
//            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
//            sdfrmt.setLenient(false);
//            // Create Date object
//              //parse the string into date
//            try {
////                Date javaDate = sdfrmt.parse(strDate);
//                System.out.println(strDate + " is valid date format");
//                System.out.println("press '0' to finish this process.");
//            }
//
//            catch (ParseException e) {
//                System.out.println(strDate + " is Invalid Date format");
//                return false;
//            }
//            return true;
//        }

//    }
