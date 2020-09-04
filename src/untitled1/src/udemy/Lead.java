package udemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lead {

    private int id = 000;
    private String name;
    private Date date;
    private boolean gender;
    private String phone;
    private String email;
    private String address;

    public Lead(int id, String name, Date date, boolean gender, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Method
    // input name
    public void inputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.setName(scanner.nextLine());
    }

    //Input DateOfBirth

    public void inputDOB() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday:");
        String birthDay = scanner.nextLine();
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yy");
        Date date = sdf.parse(birthDay);
        sdf.format(date);
        this.setDate(date);
    }

    // Input Phone

    public void inputPhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number:");
        this.setPhone(scanner.nextLine());
    }
    // input email

    public void inputEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email:");
        this.setEmail(scanner.nextLine());
    }

    // input gender

    public void inputGender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender(If you are male, type 'true': ");
        this.setGender(scanner.nextBoolean());
    }

    //input address

    public void inputAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your address:");
        this.setAddress(scanner.nextLine());
    }

    //update id
    public void updateId(){
        this.id= this.id+1;
    }
    //
    public Lead displayInfo(){
        System.out.printf("lead_%03d,%s,%tF,%b,%s,%s,%s%n",this.getId(),this.getName(),this.getDate(),this.isGender(),
                this.getPhone(),this.getEmail(),this.getAddress());
        return null;



    }
}











