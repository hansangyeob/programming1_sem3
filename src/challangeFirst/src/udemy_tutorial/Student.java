package udemy_tutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student
{
    int id;
    String name;
    Date birthDate;
    String address;
    int phone;
    String email;

    public Student() {
    }

    //Constructor
    public Student(int id, String name, Date birthDate,  int phone, String email)
    {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = "702 NVL";
        this.phone = phone;
        this.email = email;
    }

    //Getter and Setter:
    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean canRideBike() throws ParseException {

        Date date = new Date();

        int diffInDays = (int)( (date.getTime() - this.getBirthDate().getTime())
                / (1000 * 60 * 60 * 24) );

        System.out.println(diffInDays);

        if (diffInDays/365>=18) return true;
        else return false;
    }
}
