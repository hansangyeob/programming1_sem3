package udemy;

import java.util.ArrayList;
import java.util.Scanner;


public class Customer {
    private static ArrayList<Customer> customers = new ArrayList<>();

    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer(){

    }

    public Customer(String id, String name, String dateOfBirth, String gender, String phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void updateCustomer(String customerId, String updateTarget, String newInfo){
        for (int i = 0; i < customers.size(); i++) {
            if(customerId.equals(customers.get(i).getId())){
                // fine value to modify
                Customer lead = customers.get(i);

                switch (updateTarget){
                    case "name" : {
                        lead.setName(newInfo);
                        break;
                    }
                    case "address" : {
                        lead.setAddress(newInfo);
                        break;
                    }
                    case "date of birth":{
                        lead.setDateOfBirth(newInfo);
                        break;
                    }
                    case "gender":{
                        lead.setGender(newInfo);
                        break;
                    }
                    case "phone":{
                        lead.setPhoneNumber(newInfo);
                        break;
                    }
                    case "email":{
                        lead.setEmail(newInfo);
                        break;
                    }

                }

            }
        }
        System.out.println("updated interaction of " + customerId);
    }

    public void deleteCustomer(String CustomerId){
        for (int i = 0; i < customers.size(); i++) {
            if(CustomerId.equals(customers.get(i).getId())){
                customers.remove(customers.get(i));
            }
        }
        System.out.println("deleted interaction of " + CustomerId);
    }

    public void printAllCustomers(){
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

}
